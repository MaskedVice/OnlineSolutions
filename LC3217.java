import java.util.HashSet;
import java.util.Set;

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
public class LC3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i : nums){
            hashSet.add(i);
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode ans = temp;
        while(temp != null){
            ListNode n = temp.next;
            while(n != null && hashSet.contains(n.val)){
                n = n.next;
            }
            temp.next = n;
            temp = temp.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        LC3217 obj = new LC3217();
        int[] nums = {1,2,3};
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode ans = obj.modifiedList(nums,head);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

}
