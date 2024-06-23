package map;

import java.util.*;

public class frequency {

    static void calculateFrequency(int[] ar) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (h.containsKey(ar[i])) {
                h.put(ar[i], h.get(ar[i]) + 1);
            } else {
                h.put(ar[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values of array");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        calculateFrequency(ar);
        sc.close();
    }

}
