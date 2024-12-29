/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode f = head;
        ListNode s = f.next;
        // int temp = f.val;
        // f.val = s.val;
        // s.val = temp;
        // f = s.next;
        // s = f.next;
        while (f != null && s != null) {
            int temp = f.val;
            f.val = s.val;
            s.val = temp;
            if (s.next!=null&&s.next.next != null) {
                f = s.next;
                s = f.next;
            }else {
                break;
            }
        }
        return head;
    }
}