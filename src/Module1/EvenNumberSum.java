package Module1;

public class EvenNumberSum {
    public static void main(String[] args) {


        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }

        System.out.println("sum of even numbers 1-100 is:" +sum);
    }

}
