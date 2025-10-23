import java.util.Scanner;  

public class functions{

  public static void main(String[] args) {
    sum();
    
  }
    static void  sum(){

        Scanner src = new Scanner(System.in);
            
        System.out.print("Print First Number : ");
        int num1 =src.nextInt();
        System.out.print("Print Second  Number : ");
        int num2 =src.nextInt();
        int Sum =num1 +num2;
        System.out.println("Sum of Numbers are " + Sum);

    }

    


}