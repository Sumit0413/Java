public class functions{

    public static void main(String[] args){
        System.out.println("Starting with functions ");
        mynum();
        num2(200 , 900);

    }

        static void mynum() {
            int i = 6;
            int j=10;
            int sum = i+j;
            System.out.println(sum);
        } 

        static void num2(int a ,int b ) {
            int sum = a+b;
            System.out.println(sum);
        }
    }