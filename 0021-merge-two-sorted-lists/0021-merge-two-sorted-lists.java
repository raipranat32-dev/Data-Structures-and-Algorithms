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
    public ListNode midfind(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next !=null)
        {
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ll = new ListNode(-1);
        ListNode temp = ll;
          while(list1 != null && list2 != null)
          {
            if(list1.val<=list2.val)
            {
              temp.next = list1;
              temp = temp.next;
              list1 = list1.next;
            }
            else
            {
               temp.next = list2;
              temp = temp.next;
              list2 = list2.next;
            } 
            }
          
          while(list1 != null)
          {
             temp.next = list1;
              temp = temp.next;
              list1 = list1.next;
          }
          while(list2 != null)
          {
             temp.next = list2;
              temp = temp.next;
              list2 = list2.next;
          }
          return ll.next;
    }
    public ListNode merge(ListNode head)
    {
        if(head== null||head.next == null )
        {
            return head;
        }
        ListNode mid = midfind(head);
        ListNode Lefthead = head;
        ListNode Righthead = mid.next;
        mid.next =null;
        ListNode newright = merge(Righthead);
        ListNode newleft = merge(Lefthead);
        return mergeTwoLists(newleft,newright);
    }
}