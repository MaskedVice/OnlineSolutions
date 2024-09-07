/**
 * LC21MergeTwoSortedLists
 */
public class LC21MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1),cur = new ListNode();
        ans.next= cur;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                cur.val = list1.val;
                list1 = list1.next;
            } else{
                cur.val = list2.val;
                list2 = list2.next;
            }
            cur.next = new ListNode();
            cur = cur.next;
        }

        while(list1 != null){
            cur.val = list1.val;
            list1 = list1.next;
            if (list1 != null) {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }

        while(list2 != null){
            cur.val = list2.val;
            list2 = list2.next;
            if (list2 != null) {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }

        return ans.next;
    }

    public static void main(String[] args) {

        ListNode list1  = null;
        ListNode list2  = null;

        LC21MergeTwoSortedLists obj = new LC21MergeTwoSortedLists();
        obj.mergeTwoLists(list1, list2);
    }
}





class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}