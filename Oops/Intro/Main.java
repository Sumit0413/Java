

public class Main {
    public static void main(String[] args) {
        System.out.println("Class XII");


        Student Sumit = new Student(24 , "Sumit Kr Singh" , 94.23f);
        System.out.println(Sumit.marks );
         System.out.println(Sumit.name );
          System.out.println(Sumit.rno );
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student(int rno , String name ,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
