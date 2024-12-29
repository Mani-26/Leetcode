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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode li=res;
        int n=0;
        for (ListNode list : lists) {
            while(list!=null){
                ListNode newNode = new ListNode(list.val);
                li.next=newNode;
                li=li.next;
                list=list.next;
                n++;
            }
        }
        ListNode h=res.next;
        while(h!=null){
            ListNode min=h;
            ListNode temp=h.next;
            while(temp!=null){
                if(min.val>temp.val){
                    min=temp;
                }
                temp=temp.next;
            }
            int data=min.val;
            min.val=h.val;
            h.val=data;
            h=h.next;
        }
        return res.next;
    }
}