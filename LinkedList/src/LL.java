public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int val){
            this.data = val;
        }
        public Node(int val , Node next){
            this.data = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head =node;

        if(tail == null){
            tail = node;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insert(int val , int index){
        if(index==0){
            insertFirst(val);
            return;
        }else if(index==size){
            insertLast(val);
            return;
        }else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val , temp.next);
            temp.next = node;
            size++;

        }
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secLast = get(size -2);
        int val = tail.data;
        tail = secLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        else if(index == size-1){
            return deleteLast();
        }
        else{
            Node prev = get(index-1);
            int val = prev.next.data;
            prev.next = prev.next.next;
            size--;
            return val;
        }
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    //Reversal of LL using Recursion
    public Node reverse(Node head){
        if(head ==null || head.next ==null){
            return head;
        }
            Node newHead = reverse(head.next);
            Node nxt = head.next;
            nxt.next = head;
            head.next = null;
        return newHead;
    }
    // inside class LL
    public void reverse() {
        if (head == null || head.next == null) return;
        // old head will become tail after reverse
        tail = head;
        head = reverse(head); //implementing reverse(Node) method
    }


    //In-place LL reversal
    public void reverseInPlace(){
        if(size < 2){
            return ;
        }
        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = pres.next;
            }
        }
        head = prev;
    }

    //Middle Node of LL (concept of Fast and Slow pointer)
    public Node mid(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next!= null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}