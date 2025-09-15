import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

       
/*
1.


 
* * * * 
* * * * 
* * * * 
* * * * 

 
Scanner src = new Scanner(System.in);
System.out.print("Enter value of Rows : ");
int rows =src.nextInt();

for(int i=1 ; i<= rows ;i++){
    for(int j=1 ; j<=rows ;j++){
        System.out.print("* ");
    } 
    System.out.println();
}
src.close();





2. 

* 
* *
* * *
* * * *
* * * * * 
* * * * * *

Scanner src = new Scanner(System.in);
System.out.print("Enter value of Rows : ");
int rows =src.nextInt();

for( int i =1 ;i<=rows; i++ ){
    for( int j=1; j <=i  ; j++ ){

        System.out.print("* ");
    }
    System.out.println();
    src.close();
}





3.


1
12
123
1234
12345
123456
1234567

Scanner src = new Scanner(System.in);
System.out.print("Enter value of Rows : ");
int rows =src.nextInt();

for( int i =1 ;i<=rows; i++ ){
    for(int j=1 ;j<=i ;j++){
        System.out.print(j);
    }
    System.out.println();
    src.close();
}






4.



* * * * * 
* * * *   
* * *     
* *       
* 



Scanner src = new Scanner(System.in);
System.out.print("Enter value of Rows : ");
int rows =src.nextInt();

for( int i =1 ;i<=rows; i++ ){

    for(int j =rows ; j >=i ;j--){

        System.out.print("* ");
    }
    System.out.println();
    src.close();
}




5.



1 2 3 4 5 
1 2 3 4   
1 2 3     
1 2       
1   



Scanner src = new Scanner(System.in);
System.out.print("Enter value of Rows : ");
int rows =src.nextInt();

for( int i = 1 ;i<=rows; i++ ){

    for(int j = rows ; j >= i ;j-- ){

        System.out.print(rows - j + 1 +" ");
    }
    System.out.println();
    src.close();


}


6.

1
22
333
4444
55555



Scanner src = new Scanner(System.in);
System.out.print("Enter value of Rows : ");
int rows =src.nextInt();

for( int i = 1 ;i<=rows ; i++ ){

    for(int j = 1 ; j <= i ;j++ ){

        System.out.print( i+ "");
    }
    System.out.println();
    src.close();


}




7.




     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *


Scanner src = new Scanner(System.in);
System.out.print("Enter Value of rows : "); 
int rows = src.nextInt();

for(int i = 1; i <= rows; i++) {
   
    for(int j = rows - 1 ; j >= i; j--) {
        System.out.print(" ");  
    }
  
    for(int k = 1; k <= i; k++) {  
        System.out.print("* ");
    }
    System.out.println();
}

src.close();




8.

*********
 *******
  ***** 
   ***  
    *   



Scanner src = new Scanner(System.in);
System.out.print("Enter Value of rows : "); 
int rows = src.nextInt();

for(int i = 1; i <= rows; i++) {
    // Print leading spaces
    for(int j = 1; j < i; j++) {
        System.out.print(" ");  
    }
    // Print stars
    for(int k = 1; k <= (2 * (rows - i) + 1); k++) {  
        System.out.print("*");
    }
    System.out.println();
}

src.close();

*/

//End    
}
}
