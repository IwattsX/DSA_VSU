#include <iostream>
using namespace std;

// Creating a node
template<typename T>
class Node {
   public:
  T value;
  Node* next;
};

template<typename T>
class LinkedList{
    public:
    Node<T>* head = NULL;
    
    void insert(T data){
        Node<T>* node = new Node<T>();
        node->value = data;
        if(head == NULL){
            head = node;
        }
        else{
            Node<T>* last = head;
            while(last->next != NULL){
                last = last->next;
            }
            last->next = node;
        }
    }
    void print(){
        Node<T>* curr = head;
        while(curr != NULL){
            cout << curr->value << " -> ";
            curr = curr->next;
        }
        cout << "NULL" << endl;
    }
    ~LinkedList() {
        Node<T>* current = head;
        while (current != nullptr) {
            Node<T>* next = current->next;
            delete current;
            current = next;
        }
    }
};

int main() {
    LinkedList<int> list;
    list.insert(2);
    list.insert(3);
    list.insert(3);
    list.insert(100);
    list.print();

    LinkedList<string> list2;
    list2.insert("Hello");
    list2.insert("World!");
    list2.print();
}