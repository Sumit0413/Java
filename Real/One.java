import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        System.out.println("First Real life program");

        /*
         * 1.Employee Salary Calculator: Write a program to calculate the monthly
         * salary for 10 employees. For each employee, ask for their base salary and
         * bonus, then print the total salary.
         */


        int numberofEmployee = 10;

        for(int i = 1; i <= numberofEmployee ; i++ ){

            System.out.print("Employee " + i + " = ");

            
        Scanner amt = new Scanner(System.in);
        System.out.print("Enter Your base salary : ");
        int base = amt.nextInt();

        Scanner extamt =new Scanner(System.in);
        System.out.print("Enter Your bonus salary : ");
        int bonus = extamt.nextInt();

        int TotalSalary = base + bonus;
        System.out.println("Total Salary Of The Empolyee is " + TotalSalary);
        
        }
      
    }
     
}
