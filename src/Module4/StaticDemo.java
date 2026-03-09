package Module4;

class Student {
    String name;
    static String college = "MIT";

    Student(String name) {
        this.name = name;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege("NIE");

        Student s1 = new Student("Priya");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}