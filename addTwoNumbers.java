/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int remain = 0;
        while(l1 != null || l2!= null || remain != 0){
            if(l1!= null){
                remain += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                remain+= l2.val;
                l2 = l2.next;
            }
              dummy.next = new ListNode(remain%10);
                dummy = dummy.next;
            remain /= 10;
        }
        return head.next;
        
    }
}