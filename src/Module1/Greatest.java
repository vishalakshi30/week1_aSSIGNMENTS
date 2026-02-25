package Module1;
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b && a>c) {
            System.out.println(a + "is the greatest number");
        }
            else if(b>a && b>c) {
            System.out.println(b + "is the greatest number");
        }else
            System.out.println(c +"is the greatest number");


        }
    }


