package recursion;
import java.util.*;

public class palindrome {

    static boolean reverse(String st, int start, int end) {

        if (start >= end) {
            return true;
        }
        if (st.charAt(start) != st.charAt(end)) {
            return false;
        }

        return reverse(st, start + 1, end - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String str = sc.nextLine();
        boolean isPalindrome = reverse(str, 0, str.length()-1);
        if (isPalindrome) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
