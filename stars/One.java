import java.util.Scanner;

public class One {
   public static void main(String[] args) {
      System.out.println("Stars printing");

      /*
      
       * * * * 
       * * * *
       * * * *
       * * * *
       
       */

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter no of Rows : ");
      int row = sc.nextInt();

    

      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= row; j++) {
            System.out.print("*");
         }
         System.out.println();
      }

      sc.close();
      

   }
}
