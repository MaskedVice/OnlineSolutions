public class LC83RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur =head,next = null;

        while(cur!=null && cur.next!=null){
            next = cur.next;
            while(next!=null && cur.val==next.val){
                next = next.next;
            }
            cur.next = next;
            cur = next;
        }
        return head;
    }


    /**
 * Definition for singly-linked list.
 * */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
