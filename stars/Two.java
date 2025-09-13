import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("HII");

        /*
         
         * 
         * *
         * * *
         * * * *
         
         */

         Scanner src = new Scanner(System.in);
         System.out.print("Enter no of Rows : ");
         int Rows = src.nextInt();

         for(int i = 1;i <= Rows; i++ ){
            for(int j =1; j<=i ;j++){
                System.out.print("* ");
            }
             System.out.println();
         }
        
         src.close();

    }

}
