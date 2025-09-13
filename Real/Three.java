import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Third Real life program");

        /*
         * Inventory Alert: Write a program to check the stock of 20 products. For each
         * product, if the stock is less than 10, print
         * "Low stock alert for Product [ID]".
         */

            int stock = 20 ;
            for(int i=1 ; i<=10 ; i++){

                Scanner scr =new Scanner(System.in);
                System.out.print("Enter number of stocks : ");
                int Prod = scr.nextInt();
                
                if(Prod < 10){
                    System.out.println("Low Stocks");
                }else{
                    System.out.println("Stocks Avalible");
                }
            }
    }

}
