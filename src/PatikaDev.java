public class PatikaDev {
    static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        // Fibonacci dizisi = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, …}
        System.out.println(fib(10));
    }
}

