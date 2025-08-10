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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i=0;
        ListNode curr1=list1;
        ListNode ta=null, tb=null;
        ListNode curr2=list2;
        while(curr1!=null){
            if(i+1==a){
                ta=curr1;
            }
            if(i==b){
                tb=curr1.next;
            }
            i++;
            curr1=curr1.next;
        }
        while(curr2.next!=null){
            curr2=curr2.next;
        }
        curr2.next=tb;
        ta.next=list2;
        return list1;
    }
}