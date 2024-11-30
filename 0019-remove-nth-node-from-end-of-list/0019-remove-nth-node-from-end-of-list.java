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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return helper(head,n,new int[1]);
    }
    public ListNode helper(ListNode head, int n,int[] k){
        if(head==null) return null;
        ListNode current=head;
        head.next=helper(head.next,n,k);
        k[0]++;
        if(k[0]==n){
            return head.next;
        }
        return head;
    }
}