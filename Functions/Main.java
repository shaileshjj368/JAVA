import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Q: take input of 2 numbers and print the sum
        // sum();
        // int ans = sum2();
        // System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is "+ sum);
        in.close();
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        in.close();
        return sum;
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
