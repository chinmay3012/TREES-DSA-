public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item) {
        if(isFull()){
            System.out.println("The queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("the queue is empty");
        }
        int removed = data[0];

        //we need to shift the elements here
        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public void display() {
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
}
