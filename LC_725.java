public class LC_725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            i++;
            temp = temp.next;
        }
        int NoWithExtraElement = i%k;
        int extraElement = i/k;

        ListNode[] ans = new ListNode[k];
        temp = head;
        for(int j = 0 ; j < k ; j++){
            if(temp == null){
                ans[j] = null;
                continue;
            }
            temp = addToAns(j, ans, temp, extraElement, NoWithExtraElement);
            if(NoWithExtraElement > 0){
                NoWithExtraElement--;
            }
        }

        return ans;
        
    }

    private ListNode addToAns(int j, ListNode[] ans, ListNode temp, int extraElement, int noWithExtraElement) {
        ListNode cur = temp,prev = null;
        int count = 0;
        while(count < extraElement + (noWithExtraElement > 0 ? 1 : 0)){
            prev = cur;
            cur = cur.next;
            count++;
        }
        ans[j] = temp;
        prev.next = null;
        return cur;
    }

    public static void main(String[] args) {
        LC_725 obj = new LC_725();

//         head =
// [1,2,3,4,5,6,7,8,9,10]
// k =
// 3

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8); 
        head.next.next.next.next.next.next.next.next = new ListNode(9); 
        head.next.next.next.next.next.next.next.next.next = new ListNode(10); 

        obj.splitListToParts(head, 3);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
