
import java.util.Scanner;
public class fibbonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int a=0,b=1;
        for(int i=2;i<=num;i++){
            int temp=b;
            b=b+a;
            a=temp;
        }
        System.out.println(b);
    }
}
