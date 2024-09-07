public class CN_SumBetweenZeros {
    public static LinkedListNode<Integer> sumBetweenZeros(LinkedListNode<Integer> head) {
        //Write your code here
        try{
            if(head == null || (head.next == null && head.data ==0)){
            return null;
            }
            LinkedListNode<Integer> ans = new LinkedListNode<>(-1),res = ans;
            int sum = 0;

            while(head != null){
                if(sum == 0){
                    head = head.next;
                    while(head != null && head.data != 0){
                        sum+=head.data;
                        head = head.next;
                    }
                } else {
                    System.out.println(sum);
                    LinkedListNode<Integer> t = new LinkedListNode<>(sum);
                    ans.next = t;
                    ans = ans.next;
                    sum = 0;
                }
            }
            return res.next;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = new LinkedListNode<>(0);
        head.next = new LinkedListNode<>(1);
        head.next.next = new LinkedListNode<>(2);
        head.next.next.next = new LinkedListNode<>(3);
        head.next.next.next.next = new LinkedListNode<>(0);
        head.next.next.next.next.next = new LinkedListNode<>(4);
        head.next.next.next.next.next.next = new LinkedListNode<>(5);
        head.next.next.next.next.next.next.next = new LinkedListNode<>(0);
        head.next.next.next.next.next.next.next.next = new LinkedListNode<>(6);
        head.next.next.next.next.next.next.next.next.next = new LinkedListNode<>(0);
    }
}

class LinkedListNode<T>  {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data)  {
        this.data = data;
    }
}
