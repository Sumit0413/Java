import java.util.Scanner;
public class Four{

    public static void main(String[] arr){


        Scanner src = new Scanner(System.in);
        System.out.print("Enter your Num : ");
        int num =src.nextInt();
        System.out.print("Printing Sum of " + num + " Numbers");
        System.out.println();

        int result =Add(num ,1);
        System.out.print("Sum : "+ result);

        
    }

    static int Add(int num , int newSum){
        if ( num < newSum ) {
            return 0;
        }
        System.out.println(newSum);
       return newSum + Add(num ,newSum +1);
          
 }
}