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
    public int size(ListNode head)
    {
        int c=0;
        while(head != null)
        {
        c++;
        head = head.next;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int pos = size(head)-n+1;
        int k=1;
        ListNode temp = head;
        if(pos == 1)
        return head.next;
        while(k!=pos-1)
        {
            temp = temp.next;
            k++;
        }
        temp.next = temp.next.next;
        return head;
    }
}