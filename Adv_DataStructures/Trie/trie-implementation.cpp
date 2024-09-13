#include <iostream>
#include <vector>
#include <map>

class TrieNode {
public:
    TrieNode() {}
    std::map<char, TrieNode*> children;
};

class Trie {
public:
    Trie() {
        root = new TrieNode();
    }

    TrieNode* search(std::string word) {
        TrieNode* currentNode = root;

        for (const auto& c : word) {
            if (currentNode->children.find(c) != currentNode->children.end()) {
                currentNode = currentNode->children[c];
            }
            else {
                return nullptr;
            }
        }
        return currentNode;
    }

    void insert(std::string word) {
        TrieNode* currentNode = root;

        for (const auto& c : word) {
            if (currentNode->children.find(c) != currentNode->children.end()) {
                currentNode = currentNode->children[c];
            }
            else {
                TrieNode* newNode = new TrieNode();
                currentNode->children[c] = newNode;
                currentNode = newNode;
            }
        }
        currentNode->children['*'] = nullptr;
    }

private:
    TrieNode* root;
};

int main() {
    Trie TrieData;
    std::vector<std::string> words = {
        "apart", "apple", "bin", "binary", "bit", "byte", "day", "days", "deep", "Isaac"
    };

    for (const auto& word : words) {
        TrieData.insert(word);
    }

    std::vector<std::string> Test = {
        "apart", "apple", "bin", "binary", "bit", "byte", "day", "days", "deep", "Isaac", "hey"
    };

    for (const auto& t : Test) {
        if (TrieData.search(t) == nullptr) {
            std::cout << t << " is not in the Trie" << std::endl;
        }
        else {
            std::cout << t << " is in the Trie" << std::endl;
        }
    }
    return 0;
}
