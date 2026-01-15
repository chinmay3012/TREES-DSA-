import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();
        switch(day){
            case 1 : System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            default : System.out.println("Enter a number");
        }
    }
}
