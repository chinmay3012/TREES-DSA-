public class Main{
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertLast(99);

        list.display();
        System.out.println(" ");
        System.out.println(list.mid() + " ");
        list.reverseInPlace();
        list.display();
    }
}