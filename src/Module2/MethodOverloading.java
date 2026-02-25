package Module2;
import java.util.Scanner;
public class MethodOverloading {

        public static void main(String[] args) {
            display(67);
            display(2,3);
            display("Hello World");

        }
        public static void display(int n){
            System.out.println(n);
        }
        public static void display(int a,int b){
            System.out.println(a+" "+b);
        }
        public static void display(String s){
            System.out.println(s);
        }

    }


