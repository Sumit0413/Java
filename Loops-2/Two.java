import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Second Real life program");

        /*
         * 2. Temperature Monitor: Write a program that continuously reads temperature
         * from a sensor (simulated by user input) and stops only when the temperature
         * exceeds 100°C. Print a warning when it does.
         */
          Scanner scanner = new Scanner(System.in);
           System.out.print("How many temperature readings do you want to check? ");
           int Reading = scanner.nextInt();

         for(int i = 1 ; i < Reading ; i++ ){

             Scanner Temp = new Scanner(System.in);
            System.out.print("What is the current Temp in C ");
            int Temprature =Temp.nextInt();

            if(Temprature >=100){
                System.out.println("Warning");
            }
         }
    }

}
