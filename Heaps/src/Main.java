import java.util.*;

public class Main{
    public static void main(String[] args) {
        Heaps<Integer> heap = new Heaps<>();
        heap.insert(20);
        heap.insert(10);
        heap.insert(40);
        heap.insert(30);
        heap.insert(50);

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);

    }
}