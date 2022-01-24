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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        boolean falg=true;
        int l=0;
        int r=arr.size()-1;
        for( l=0;l<(arr.size()/2);l++,r--){
            if(arr.get(l)!=arr.get(r)){
               falg=false;
            }
        }
        return falg;
    }
}