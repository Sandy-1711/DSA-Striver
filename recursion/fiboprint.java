package recursion;

import java.util.*;

public class fiboprint {

    static int printFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return (printFibonacci(n - 1) + printFibonacci(n - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printFibonacci(n));
        sc.close();
    }
}
