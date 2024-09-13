def backwards_string(s : str) -> str:
    if not s:
        return ""
    return s[-1] + backwards_string(s[:len(s)-1])

if __name__ == '__main__':
    userInput = input("Enter a string: ")
    print(f"Reversed string is '{backwards_string(userInput)}'")