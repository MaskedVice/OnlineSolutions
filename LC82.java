public class LC82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = head;
        while(a!= null)
        {
            int val = a.val;
            
            if(a.val == a.next.val)
            {
                a = a.next.next;
            }
            a = a.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode t = a;
        int[] l = new int[]{2,3,3,4,4,5};
        for (int i = 0; i < l.length; i++) {
            ListNode temp = new ListNode(l[i]);
            t.next = temp;
            t = t.next;
        }

        LC82 k = new LC82();
        k.deleteDuplicates(a);
    }
}
