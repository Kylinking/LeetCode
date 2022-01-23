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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newnode=new ListNode(0);
        newnode.next=head;
        ListNode pre=newnode;
        while(pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
              // pre.next.next=null;
            }else{
                pre=pre.next;
            }
        }
        return newnode.next;
    }
}