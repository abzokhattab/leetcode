/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

      public ListNode mergeNodes(ListNode head) {
     ListNode temp = head, temp2 = head.next;
     int sum=0;
        
        while(temp2!=null){
            if(temp2.val==0){ 
                temp.next.val=sum;   // changing the value to sum
                temp.next.next=temp2.next;  // relinking the LL
                temp=temp.next; // moving temp 
                sum=0; // resetted for further nodes
           }
            sum+=temp2.val; // calculating sum till we reach 0
            temp2=temp2.next;
        }
        return head.next; // we don't want to include the first 0
    }
}
