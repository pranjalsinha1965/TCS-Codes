// package linkedlist;
// import java.util.Scanner;

// public class takeInput {
//     public static Node<Integer> takeinput(){
//         Scanner s = new Scanner(System.in);
//         Node<Integer> head = null;
//         int data = s.nextInt();
//         while (data != -1){
//             Node<Integer> currentNode = new Node<Integer>(data);
//             if(head == null)
//             {
//                 head = currentNode;

//             } else {
//                 Node<Integer> tail = head;
//                 while(tail.next != null)
//                 {
//                     tail = tail.next;
//                 }
//                 tail.next = currentNode;                
//             }
//             data = s.nextInt();
//         }
//     }
// }
