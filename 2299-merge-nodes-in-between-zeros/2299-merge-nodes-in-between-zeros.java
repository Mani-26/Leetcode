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
        ListNode res=new ListNode(0);
        ListNode h1=res;
        head=head.next;
        while(head!=null){
            int sum=0;
            while(head!=null&&head.val!=0){
                sum+=head.val;
                head=head.next;
            }
            if(sum>0){
                ListNode temp=new ListNode(sum);
                h1.next=temp;
                h1=h1.next;
            }
            head=head.next;
        }
        return res.next;
    }
}