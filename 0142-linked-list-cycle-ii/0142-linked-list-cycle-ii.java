/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode walker= head;
        ListNode runner= head;
        
        while(runner!=null && runner.next!=null){
            walker=walker.next;
            runner=runner.next.next;
            if(walker==runner)
            {
                walker=head;
                while(walker!=runner){
                    walker=walker.next;
                    runner=runner.next;
                }
                return walker;
            }
        }
        return null;
    }
}