import java.util.Scanner;

public class ProblemB{

    

    public static void main(String[] arr){
        System.out.println("Some Basic Question of recursion ");


        // 1. Print your name n times using recursion  


         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Hellow " + name );
        
        Scanner src= new Scanner(System.in);
        System.out.print("How Many Times You Want To print Your Name : ");
        int  Time =src.nextInt();
        System.out.println("OK i will print Your Name  " + Time + " Times");
        System.out.println("Let's Begin ");

        sc.close();
        PrintName(name ,Time ,1);
    }

    static void PrintName(String name,int Time ,int crrtime){
            if(crrtime>Time){
                return;
            }
       System.out.println(name);
        PrintName(name ,Time,crrtime + 1);
    }


    // 2.
   


}