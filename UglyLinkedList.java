public class UglyLinkedList {

    private ListNode front;
    private class ListNode {
        int data;
        ListNode next;

        public ListNode() {
            this(0, null);
        }

        public ListNode(int data) {
            this(data, null);
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        @Override public String toString() {
            return this.data + " ";
        }
    }

    // constructor for UglyLinkedList
    public UglyLinkedList() {
        front = null;
    }

    @Override public String toString() {
        String answer = "[ ";
        ListNode ptr = front;
        while (ptr != null) {
            answer += ptr.toString();
            ptr = ptr.next;
        }
        answer += "]";
        return answer;
    }

    public void makeList() {
        ListNode a = new ListNode(10, null);
        front = a;
//        ListNode b = new ListNode(20, null);
//        ListNode c = new ListNode(30, null);
//        ListNode d = new ListNode(40, null);
//        a.next = b;
//        b.next = c;
//        c.next = d;
        //System.out.println(a);
    }

    public void deleteFirstElement(){
        if(front != null)
            front = front.next;
    }

    public void deleteLastElement() {
        if(front == null) return;
        if(front.next == null){
            front = null;
            return;
        }

        ListNode ptr = front;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    public static void main(String[] args) {
        UglyLinkedList ul2 = new UglyLinkedList();
        //ul2.deleteFirstElement();
        ul2.deleteLastElement();
        System.out.println(ul2);


        UglyLinkedList ul = new UglyLinkedList();
        ul.makeList();
        //ul.deleteFirstElement();
        ul.deleteLastElement();
        System.out.println(ul);
    }
}
