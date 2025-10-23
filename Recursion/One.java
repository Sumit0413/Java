public class One{

public static void main(String[] args) {

    num1(1);
    fact(29);
    int result = factorial(a);
    System.out.println("Factorial  " + " is: " + result);
}


static int fact(int a){
    if(a ==1 || a == 0){
        return 1;
    }
    return a * fact(a - 1);
}



static void num1(int n){

    
    if(n == 5){
        return;
    }

    System.out.println(n);
    num1(n +1);

}


/*
 

static void num2(int n){
    System.out.println(n);
     num3(n+1);
}

static void num3(int n){
    System.out.println(n);
     num4(n+1);
}

static void num4(int n){
    System.out.println(n);
     num5(n+1);
}

static void num5(int n){
    System.out.println(n);
}

 */


}
