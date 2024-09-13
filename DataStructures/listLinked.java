// /**
//  * Author: Isaac Watts
//  * Date: 09/07/23
//  * Description: Made two linked list
//  */

// public class listLinked {
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);

//         list.printList();
//     }
// }

// class LinkedList<T> {
//     class Node {
//         T data;
//         Node next;

//         public Node(T val) {
//             this.data = val;
//         }
//     }

//     Node head;
//     Node tail;
//     // public void addToFront(T val){
//     //     if(this.head == null){
            
//     //     }
//     // }
//     public void remove(T val){
//         int idx = -1;
//         int iter = 0;
//         Node node = this.head;
//         Node prev = node;
//         while(node != null){
//             if(node.data == val){
//                 System.out.println("Value to remove is " + val + " at the positon " + iter);
//                 idx = iter;
//                 break;
//             }
//             iter++;
//             if(node.next != null){
//                 node = node.next;
//             }
//         }
//         if(idx == -1){
//             System.out.println(val + " value is not found");
//             return;
//         }
//         if(idx == 0){
//             this.head = head.next;
//         }
//         for(int i = 0; i<idx-1; i++){
//             System.out.println(prev.data);
//             prev = prev.next;
//         }
//         node = node.next;
//         prev.next = node;
//     }
//     public void insert(T val) {
//         Node node = new Node(val);
//         if (head == null) {
//             head = node;
//         } else {
//             Node last = head;

//             while (last.next != null) {
//                 last = last.next;
//             }

//             last.next = node;
//         }
//     }

//     public void printList() {
//         Node node = head;
//         while (node != null) {
//             System.out.print(node.data + " -> ");
//             node = node.next;
//         }
//         System.out.println("null");
//     }
// }
