package Module1;
import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        pattern(num);
    }
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print("*" + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("*"+ " ");
            }

            System.out.println();
        }
    }
}
