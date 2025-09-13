import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        System.out.println("Hii");

        /*

         * * * *
         * * *
         * *
         * 
         
         */

         Scanner src = new Scanner(System.in);
         System.out.print("Enter no of Rows : ");
         int Rows = src.nextInt();

         for(int i = Rows ;i >=1; i--){
            for(int j = 1 ;j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
         }
         src.close();
    }

}
