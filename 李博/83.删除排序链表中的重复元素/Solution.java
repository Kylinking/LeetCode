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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode headval=head;
        while(headval.next!=null){
            if(headval.val==headval.next.val){
              
                headval.next=headval.next.next;
                
            }else{
                
                headval=headval.next;
            }
        }
        
        return head;
    }
}