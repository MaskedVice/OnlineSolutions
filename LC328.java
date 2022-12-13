public class LC328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null || head.next.next == null )
            return head ;
        ListNode oit = head ;
        ListNode eit = head.next ;
        ListNode ehead = eit ;
        while(oit.next != null && eit.next != null )
        {
            oit.next = eit.next;
            oit = oit.next ;
            if(oit!=null)
            {
                eit.next = oit.next ;
                eit = eit.next;
            }
        }
        oit.next = ehead ;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode x = new LC328().oddEvenList(head);
        System.out.println(x);
    }
}
