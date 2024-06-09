import java.io.BufferedWriter;
import java.io.IOException;

public class HR_ReverseLinkedList {
    class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    class SinglyLinkedListPrintHelper {
        public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
                throws IOException {
            while (node != null) {
                bufferedWriter.write(String.valueOf(node.data));

                node = node.next;

                if (node != null) {
                    bufferedWriter.write(sep);
                }
            }
        }
    }

    class Result {

        /*
         * Complete the 'reverse' function below.
         *
         * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
         * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
         */

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         * int data;
         * SinglyLinkedListNode next;
         * }
         *
         */

        public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
            if(llist == null){
                return null;
            }
            SinglyLinkedListNode prev = null;
            SinglyLinkedListNode curr = llist;
            while(curr != null){
                SinglyLinkedListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

    }
}
