package map;

import java.util.*;

public class maxminfrequency {

    static void frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int max = 0;
        int maxEl = 0;
        int minEl = 0;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxEl = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                minEl = entry.getKey();
            }
        }
        System.out.println("Maximum: "+maxEl+" Count:"+max);
        System.out.println("Minimum: "+minEl+" Count:"+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        frequency(arr);
        sc.close();
    }
}
