import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        /*
         1. Declare an array of size 10
         
         
         int[] arr = new int[10];
         Scanner src = new Scanner(System.in);
         
         
         for (int i = 0; i < arr.length; i++) {
         System.out.print("Enter value for index " + i + ": ");
         arr[i] = src.nextInt();
         }
         
         System.out.println("Array elements are:");
         for (int i = 0; i < arr.length; i++) {
         System.out.print( + arr[i] + " " );
         }
         
         src.close();
        /

        /*
         2 . Print all elements of an array in reverse order.
         
         
         
         for( int i = arr.length - 1 ; i >= 0 ;i--){
         System.out.print(arr[i] + " ");
         }
         
        /

        /*
         
         3. Find the maximum element in an array.
         
         int[] arr = {2, 4, 5, 6, 87768, 8, 10, 67};
         int large =arr[0];
         
         for(int i = 0 ; i < arr.length ; i++){
         if(arr[i] > large ){
         large = arr[i];
         }
         }
         System.out.println(large);
        /

        /*
         
         4 . Find the minimum element in an array.
         
         int[] arr = {2, 4, 5, 6, 87768, 8, 10, 67};
         int small =arr[0];
         
         for(int i = 0 ; i < arr.length ; i++){
         if(arr[i] < small){
         small = arr[i];
         }
         }
         System.out.println(small);
         
         
         
         // 5 . Calculate the sum of all elements in an array.
         
         
         int[] arr = {2, 4, 5, 6, 87768, 8, 10, 67};
         int sum = 0 ;
         for(int i = 0 ; i < arr.length ; i++){
         sum += arr[i];
         }
         System.out.println(sum);
         
         
         
         //6 . Calculate the average of array elements.
         int[] arr = {2, 4, 5, 6, 87768, 8, 10, 67};
         int avg = 0 ;
         for(int i = 0 ; i < arr.length ; i++){
         avg += arr[i] / arr.length;
         }
         System.out.println(avg);
         



        Count the number of even and odd numbers in an array.
        int[] arr = { 2, 4, 5, 6, 87768, 8, 10, 67, 11, 33, 88, 99, 23, 5, 354, 5, 567, 65546, 34543 };

        int Even = 0;
        int Odd = 0;

        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] %2==0){
                Even++;
            }else{
                Odd++;
            }
        }
        System.out.println("Total even numbers: " + Even);
        System.out.println("Total odd numbers: " + Odd);
       
    


      //Reverse the elements of an array.
      int [] arr={ 5,6,2,9,12,656,8,5454};
        
      for(int i =arr.length -1; i>=0 ;i--){
            System.out.print(arr[i]+" ");
        
      }



    //Reverse the elements of an array. Method 2
            int [] arr={ 5,6,2,9,12,656,8,5454};

            for(int i = 0; i<arr.length /2;i++){
            int temp =arr[i];
            arr[i]=arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] =temp;

            }
            for(int i = 0; i<arr.length ;i++){
                System.out.print(arr[i]+" ");
            }

    */


    
            
     //End
    }

}
