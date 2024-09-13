/**
 * Author: Isaac Watts
 * Date: 11/26/23
 * Description: Making my own linkedlist without java collections
 */

import java.util.Scanner;

public class linkedListHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Please enter a value to add at the front of the linked list: ");
        int input = sc.nextInt();
        list.addToFront(input);
        System.out.println("The linked list is: " + list.toString());

        System.out.print("Please enter a value to add at the front of the linked list: ");
        input = sc.nextInt();
        list.addToFront(input);
        System.out.println("The linked list is: " + list.toString());

        System.out.print("Please enter a value to add at the front of the linked list: ");
        input = sc.nextInt();
        list.addToFront(input);
        System.out.println("The linked list is: " + list.toString());

        System.out.print("Please enter a value to add at the back of the linked list: ");
        input = sc.nextInt();
        list.addToBack(input);
        System.out.println("The linked list is: " + list.toString());

        System.out.print("Please enter a value to add a position of the linked list: ");
        input = sc.nextInt();
        System.out.print("Please enter the position to add the value: ");
        int index = sc.nextInt();
        list.insertAt(index, input);
        System.out.println("The linked list is: " + list.toString());

        System.out.print("Please enter a value to search for in the linked list: ");
        input = sc.nextInt();

        if (list.contains(input)) {
            System.out.println("The value " + input + " is in the linked list.");
        } else {
            System.out.println("The value " + input + " isn't in the linked list.");
        }

        int deleted = list.get(0);
        list.deleteFromFront();
        System.out.println("The value deleted is " + deleted);

        System.out.println("The linked list is: " + list.toString());

        deleted = list.tail.data;
        list.deleteFromBack();
        System.out.println("The value deleted is " + deleted);

        System.out.println("The linked list is: " + list.toString());

        
        System.out.print("Please enter the position to delete a value: ");
        index = sc.nextInt();
        deleted = list.get(index);
        list.deleteAt(index);
        System.out.println("The value deleted is " + deleted);
        
        System.out.println("The linked list is: " + list.toString());

        list.empty();
        System.out.println("The linked list is: " + list.toString());

        sc.close();

    }
}

class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void addToFront(int value) {

        Node node = new Node(value);
        node.next = head;
        if (head == null) {
            tail = node;
        }
        head = node;
    }

    public void insertAt(int idx, int value) {
        if(idx == 0){
            this.addToFront(value);
            return;
        }
        else if(idx == this.size()-1){
            this.addToBack(value);
            return;
        }
        Node node = new Node(value);
        Node curr = this.head;
        int index = 0;
        while (curr != null && index != idx) {
            index++;
            curr = curr.next;
        }
        if (index != idx) {
            System.out.println("cannot insert there");
            return;
        }

        node.next = curr;
        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        prev.next = node;

    }

    public void addToBack(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;

    }

    public String toString() {
        StringBuilder res = new StringBuilder("[");
        Node node = head;

        while (node != null) {
            res.append(node.data);
            if (node.next == null) {
                break;
            }
            res.append(",");
            node = node.next;
        }

        res.append("]");
        return res.toString();
    }

    public boolean contains(int val) {
        for (Node curr = head; curr != null; curr = curr.next) {
            if (curr.data == val)
                return true;
        }
        return false;
    }

    public void empty() {
        while (head != null) {
            head = head.next;
        }
        tail = null;
    }

    public void deleteFromFront() {
        if (head == null) {
            return;
        }
        head = head.next;

    }

    public void deleteFromBack() {
        if (head == null) {
            return;
        }
        int size = this.size();
        Node newTail = head;
        for (int i = 0; i < size - 2; i++) {
            newTail = newTail.next;
        }
        tail = newTail;
        tail.next = null;

    }

    public void deleteAt(int idx) {
        //deleteAt head or tail cases
        if (idx == 0) {
            this.deleteFromFront();
            return;
        }
        else if(idx == this.size() - 1){
            this.deleteFromBack();
            return;
        }

        Node curr = this.head;
        int index = 0;
        while (curr != null && index != idx) {
            index++;
            curr = curr.next;
        }
        if (index != idx) {
            System.out.println("cannot delete there, index out of bounds!");
            return;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        curr = curr.next;
        prev.next = curr;
    }
    public int get(int idx){
        int index = 0;
        Node curr = this.head;
        while(curr != null && index < idx){
            curr = curr.next;
            index++;
        }
        return curr.data;
    }

    public int size() {
        int res = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            res++;
        }
        return res;
    }
}
