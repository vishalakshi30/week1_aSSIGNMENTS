package Module1;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        int a=in.nextInt();
        if(a<0) {
            System.out.println("the given number is negative");
        }
        else if(a>0) {
            System.out.println("the given number is positive");
        }
        else{
            System.out.println("the given number is zero");
        }

    }
}
