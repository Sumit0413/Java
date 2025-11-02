public class Five{

//     public static void main(String[] arr){
//         System.out.println("Find the sum of first N natural numbers");

//         int n =5;
//         int result =  PrintSum(n);
//         System.out.println(result);
//  }

// static int PrintSum(int n ){


//     if(n==0) return 0;

//    return n + PrintSum(n-1);
    
// }




// public static void main(String[] arr){
//         System.out.println("Find factorial of a number (n!)");

//         int n =5;
//         int result =  PrintFact(n);
//         System.out.println(result);
//  }

// static int PrintFact(int n ){


//     if(n==0) return 1;

//    return n * PrintFact(n-1);
    
// }


// public static void main(String[] arr){
//     System.out.println("Find nth Fibonacci number");
//     int n = 6;
//     int result = fib(n);
//     System.out.println(result);
// }

// static int fib(int n){
  
//     if(n == 0) return 0;
//     if(n == 1) return 1;
    
   
//     return fib(n-1) + fib(n-2);
// }

// public static void main(String[] arr){
//     System.out.println("Print all elements of an array recursively");
     
//     int[] arrayy= {10,20,54,5,432,442,23,56,145,215,7};
//     Printarr(arrayy ,0);
// }

// static void Printarr(int[] arrayy ,int index){
//   if (index >= arrayy.length) {
//     return ;
//   }
//   System.out.println(arrayy[index] + " ");
//   Printarr(arrayy , index+1);
   
// }

public static void main(String[] arr){
    System.out.println("Find sum of elements in an array recursively");
     
    int[] arrayy= {10,20,4,5};
   int totalSum = Printarr(arrayy ,0 );


   System.out.println("Total sum: " + totalSum);
}

static int Printarr(int[] arrayy ,int index){
  if (index >= arrayy.length) {
    return 0;
  }
  
  return arrayy[index]  + Printarr(arrayy , index+1);
  
   
}



// THE END
}