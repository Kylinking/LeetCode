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
    public ListNode reverseList(ListNode head) {
      ListNode reat=head;
      ListNode left=null;
      while(reat!=null){
          ListNode next=reat.next;
            reat.next=left;
             left=reat;
            reat=next;
           
      }
      return left;
    }
   
}