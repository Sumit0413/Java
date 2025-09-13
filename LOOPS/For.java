import java.util.Scanner;

public class For{


public static void main(String[] args){
    System.out.println("FOR LOOPS STARTED");

    // for(int i = 1 ; i <= 10 ; i++){
    //     System.out.println(i);
    // }
    // for(int j = 1 ; j <=1000000 ; j = j*10){
    //         System.out.println(j);
    // }

    // for(int k =7 ;k<=70 ; k=k+7){
    //     System.out.println(k);
    // }
       

//Factorial
    
//       int fact = 1;
//       Scanner src = new Scanner(System.in);
//       System.out.println("Exter your Number");
//       int n = src.nextInt();

//   for(int i= 1 ; i<=n ; i++){

//     fact = fact *i;
//   }

//   System.out.println( fact);

// src.close();



//reverse of a number 

Scanner src = new Scanner(System.in);
System.out.println(" Enter Your Number : " );
int num = src.nextInt();
int rev = 0 ;

for( ; num > 0 ; num = num / 10)
{
    int digit = num % 10 ;
    rev = rev * 10  + digit;
}
System.out.println(rev);

src.close();

}}
