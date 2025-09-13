import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("Fourth Real life program");

        /*
         * ATM PIN Retry: Write a program that asks the user for their ATM PIN. If the
         * PIN is incorrect, ask again until they enter the correct PIN (e.g., "1234").
         * Print "Access granted" when correct.
         */
        
        int pin =7650;

        Scanner src =new Scanner(System.in);
            System.out.println("Enter Code : ");
            int code = src.nextInt(); 
            boolean granted = false;

         for(int i=1 ; i <= 3 ;i++ ){

            if( code == pin){
                System.out.print("Access Granted ");
                granted =true;
                break;
            }else{
                System.out.print("Access Denied ");
                granted=false;
                break;
            }
           
        }
      
    }
}
