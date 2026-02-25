package Module2;
public class Student {
    String name;
    int rollNO;
    int marks;
    static String college="Sapthagiri College of Engineering";
    Student() {
    }

    Student (String name,int rollNo,int marks){
        this.name=name;
        this.rollNO=rollNo;
        this.marks=marks;
    }
    public void display(){
        System.out.println("Name: "+name+" rollNo: "+rollNO+" Marks: "+marks+" College: "+college);
    }
}
class StudentDemo{
    public static void main(String[] args) {
        Student s1=new Student("Arjun",201,89);
        Student s2=new Student("Alia",202,76);
        Student s3=new Student("Suma",203,59);
        Student s4=new Student("Banu",204,95);
        Student s5=new Student("Darshan",205,90);
        Student s6=new Student();

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}
