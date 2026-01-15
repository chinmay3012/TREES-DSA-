import java.util.Scanner;
public class occurence {
    public static void main(String[] args) {

        System.out.println("enter the number you want : ");

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        System.out.println("Enter the digit you want us to count :");
        int dig=in.nextInt();
        int count=0;

        while(n>0){
            int rem=n%10;

            if(rem==dig){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);




    }
}
