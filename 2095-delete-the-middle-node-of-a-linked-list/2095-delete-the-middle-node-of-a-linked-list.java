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
        if(head==null || head.next==null) return null;
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next!=null && runner.next.next!=null){
            walker = walker.next;
            runner= runner.next.next;
        }
        if (runner.next==null){
            runner = walker;
            walker=head;
            while (runner!=walker.next){
                walker=walker.next;
            }
            walker.next=runner.next;
            return head;
        }
        else if (runner.next.next==null){
            walker.next=walker.next.next;
            return head;
        }
        return null;
    }
}