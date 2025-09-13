import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("HII");

        Scanner src = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int Rows = src.nextInt();

        for(int i = 1; i <= Rows; i++) {
            
            // Print decreasing spaces (FIXED)
            for(int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        src.close();
    }
}