import java.util.* ;

// Problem Link: https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

public class ReverseLL{

    static class SinglyLinkedListNode{
          int data;
          SinglyLinkedListNode next;

          SinglyLinkedListNode (int data){
            this.data = data ;
            this.next = null ;
          }
    }
      public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {

        SinglyLinkedListNode next ; //to store the next node 
        SinglyLinkedListNode curr = llist ; // to store the head 
        SinglyLinkedListNode prev = null ; // to store the pvious node

        // Working (Swapping method)
        // Previous node of current node becomes its next node 
        // next node of current node becomes its previous Node
        while( curr != null){

            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        llist = prev ;
        return llist ;

    }

    public static void main( String args[]){

        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        head.next = new SinglyLinkedListNode(2);
        head.next.next = new SinglyLinkedListNode(3);
        head.next.next.next = new SinglyLinkedListNode(4);
        head.next.next.next.next = new SinglyLinkedListNode(5);

            System.out.println("Reversed LL");

    SinglyLinkedListNode reversed =   reverse(head);
    SinglyLinkedListNode temp = reversed ;
     while(temp != null ){
            System.out.print(temp.data+ "->");
            temp = temp.next ;
        }
        }
 }
