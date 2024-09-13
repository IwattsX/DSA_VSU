# Name: Isaac Watts
# Date: 04/17/24
# Description: 
# Implementing a trie with the words apart, apple, bin, binary, bit, byte, day, days, deep, and Isaac
# Searching for a thing not in the trie and a thing that is not in the trie


class TrieNode:
    def __init__(self):
        self.children = {}

class Trie:
    def __init__(self):
        self.root = TrieNode()

    def search(self, word):
        currentNode = self.root

        for char in word:
            if currentNode.children.get(char):
                currentNode = currentNode.children[char]
            else:
                return None
        return currentNode
    
    def insert(self, word):
        currentNode = self.root

        for char in word:
            if currentNode.children.get(char):
                currentNode = currentNode.children[char]
            else:
                newNode = TrieNode()
                currentNode.children[char] = newNode

                currentNode = newNode
        currentNode.children["*"] = None


if __name__ == '__main__':
    TrieData = Trie()
    words = ["apart", "apple", "bin", "binary", "bit", "byte", "day", "days", "deep", "Isaac"]
    for word in words:
        TrieData.insert(word.lower())
    

    Test = ["binary", "pear"]
    for t in Test:
        if TrieData.search(t.lower()) is None:
            print(f"'{t}' is not in the trie")
        else:
            print(f"'{t}' is in the trie")
    