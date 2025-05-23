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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode res=slow;
        while(fast!=null&&fast.next!=null){
            res=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        res.next=slow.next;
        return head;
    }
}