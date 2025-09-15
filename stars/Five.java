import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        System.out.println("hii");
        
        /*

         *******  
          *****  
           ***  
            *  
         */

         Scanner src = new Scanner(System.in);
         System.out.print("Enter no of Rows : ");
         int Rows = src.nextInt();

         for(int i = Rows ; i >= 1 ; i--){
           
             for(int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
             for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
             }
             System.out.println();
            
         }
         src.close();

    }
    
}
