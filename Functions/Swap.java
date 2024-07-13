public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b); // here it does not swap the numbers 

        System.out.println(a+ " "+ b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    /*
     * Here swap function creates new object of temp and not changing 
     * the original object value. Therefore the swap function does not
     * swap the function.
     */
}
