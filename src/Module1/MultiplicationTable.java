package Module1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int number=in.nextInt();
        System.out.println("multiplication table of" + number+":");
        for(int i=1; i<=10; i++){
            System.out.println(number +"x"+i+"="+(number*i));
        }
        in.close();
    }
}
