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


9.

* 
* *       
* * *     
* * * *   
* * * * * 
* * * *   
* * * 
* *
*

 //Upper half
for(int i =1 ; i<=5 ; i++){

    for(int j = 1 ;j<=i ;j++){
        System.out.print("* ");
    }
    System.out.println();
}

// Lower half
for(int i =1 ; i<=4 ; i++){

    for(int j = 4 ;j >= i;j--){

        System.out.print("* ");
    }
    System.out.println();
}



10.

1    1
12  21
123321


int n= 3;

for(int i =1 ; i<= n ;i++){
    //number
    for(int j=1 ; j<=i ;j++){
        System.out.print(j);
    }
    //space
    for(int j =1 ;j <= 2*(n-i);j++){
        System.out.print(" ");
    }

      for(int k=i ; k>=1 ;k--){
        System.out.print(k);
    }
    //number
 

    System.out.println();
}



11.

A
A B
A B C
A B C D
A B C D E




int n = 5;

for(int i =1 ; i<=n ;i++ ){
    char ch ='A';
    for(int j =1 ; j<=i ;j++){
        System.out.print(ch+ " ");
        ch++;
    }
    System.out.println();
}



11.

ABCDE
ABCD
ABC
AB
A


int n = 5;

for(int i =1 ; i<=n ;i++ ){
    char ch ='A';
    for(int j = n ; j >=i ; j--){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}



12 .

1 
2 3 
4 5 6 
7 8 9 10       
11 12 13 14 15 


int n =5 ;
int counter = 1 ;

for( int i = 1 ;i <= n ; i++ ){

    for(int j = 1 ; j <=i ;j++ ){

        System.out.print(counter + " ");
        counter++;
    }
    System.out.println();
   


}


*/



//End    
}
}
