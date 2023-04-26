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
    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next!=null && runner.next.next!=null){
            walker = walker.next;
            runner= runner.next.next;
        }
        if (runner.next==null)return walker;
        else return walker.next;
    }
}