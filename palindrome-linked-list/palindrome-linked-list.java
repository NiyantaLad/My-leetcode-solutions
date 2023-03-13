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
        List<Integer> nodeList = new ArrayList<>();
        
        ListNode currentNode = head;
        while (currentNode!=null){
            nodeList.add(currentNode.val);
            currentNode=currentNode.next;
        }
        int i= 0;
        int j= nodeList.size()-1;
        while (i<j){
            if(!nodeList.get(i).equals(nodeList.get(j))){
               return false;
            }
             i++;
             j--; 
        }
        return true;
    }
}