import java.util.Scanner;
public class Three {
    public static void main(String[] arr){
        System.out.println("Printing 1 to n number ");

        Scanner sc = new Scanner(System.in);
        System.out.print("No of times : ");
        int num = sc.nextInt();
        System.out.println("total times is : " + num);

        Printn(1,num);
    }
    static void Printn(int num , int newnum){
        if (newnum < num) {
            return;
        }
        System.out.println(newnum);
        Printn(num, newnum -1 );
    }

}
