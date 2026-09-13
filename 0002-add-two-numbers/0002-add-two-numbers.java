class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int c = 0; // Carry
        
        // Jab tak dono list khatam na hon, ya carry bacha ho
        while (l1 != null || l2 != null || c != 0) {
            int s = c; // Pichla carry sum mein pehle hi add kar lo
            
            if (l1 != null) {
                s += l1.val;
                l1 = l1.next; // l1 ko aage badhao
            }
            
            if (l2 != null) {
                s += l2.val;
                l2 = l2.next; // l2 ko aage badhao
            }
            
            // Naya carry nikal lo (jaise 13 / 10 = 1)
            c = s / 10;
            
            // Naya node bana kar sum ka aakhiri digit daal do (jaise 13 % 10 = 3)
            temp.next = new ListNode(s % 10);
            temp = temp.next; // temp ko aage badhao
        }
        
        return res.next;
    }
}