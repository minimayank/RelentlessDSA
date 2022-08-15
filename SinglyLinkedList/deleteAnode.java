/*
https://www.codingninjas.com/codestudio/problems/delete-node-in-a-linked-list_1105578

Delete Node In A Linked List

Here we have a node which we have to delete, we don't have its head.
take an example 
2_>5_>7_>9_>10
here suppose we have 7 as our node which has to be deleted..
we have to get o/p as 2_>5_>9_>10.

*/








import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        LinkedListNode<Integer>prev=node,curr=node.next;
        prev.data=curr.data;
        prev.next=curr.next;
      
	}
}
