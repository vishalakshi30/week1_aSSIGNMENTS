package Module1;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        int marks;
        char grade;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the marks of subject");
        marks=in.nextInt();
        switch(marks/10){
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            case 5:
                System.out.println("grade E");
                break;
            default:
                System.out.println("fail");



        }

    }
}
