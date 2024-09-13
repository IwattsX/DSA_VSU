"""
Name: Isaac Watts
Date: 02/20/2024
Description: Translating a ruby code linter for Javascript linting of opening and closing braces by implementing a stack
"""



# Implementing a stack by using a list
class Stack():
    def __init__(self):
        self.stack = list()

    def pop(self):
        if self.stack:
            return self.stack.pop()
        else:
            return None
        
    def read(self):
        # last element read it
        if self.stack:
            return self.stack[-1]
        else:
            return None
        
    def push(self,char):
        self.stack.append(char)
    def clear(self):
        self.stack = []


class Linter():
    # initialize function inside ruby code
    def __init__(self):
        self.stack = Stack()
    
    
    def lint(self, text):
        # for each character in the text

        for char in text:
            # check if char == '(' or '{' or '['
            if self.__is_opening_brace(char):
                self.stack.push(char)

            # check if char == ')' or '} or ']'
            elif self.__is_closing_brace(char):
                popped_opening_brace = self.stack.pop()

                if popped_opening_brace is None:
                    return f"{char} doesn't have opening brace"
                
                # opening brace != closed
                if self.__is_not_a_match(popped_opening_brace, char):
                    return f"{char} has a mismatched opening brace"
        
        # check if the stack is not empty )
        if self.stack.read():
            return f"{self.stack.read()} does not have closing brace"
        return True
    
    # Make these privated in python
    def __is_opening_brace(self, char):
        return char in ['[', '{', '(']

    def __is_closing_brace(self,char):
        return char in [']', '}', ')']

    def __is_not_a_match(self,opening_brace, closing_brace):
        brace_dict = {
            '(' : ')',
            '[' : ']',
            '{' : '}',
        }
        return  brace_dict[opening_brace] != closing_brace
    def clearAll(self):
        self.stack.clear()



if __name__ == '__main__':
    testLinter = Linter()
    tests = ["(var x = [1, 2, 3)];", "var x = 2;)","(var x = {y: [1,2,3]})", "var x = [1, 2, 3)];"]
    i = 1

    for test in tests:
        print(f"{i}) Lint Testing javascript code:\n   {test} \n   Result: {testLinter.lint(text=test)}")
        testLinter.clearAll()
        print("-----------------")
        i += 1