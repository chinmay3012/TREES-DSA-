public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); //it will call default constructor of its parent class CustomStack
    }
    public DynamicStack(int size){
        //        this.data = new int[size];
        super(size);
    }

    public boolean push(int item){
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous item into new
            for(int i=0 ; i<data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
