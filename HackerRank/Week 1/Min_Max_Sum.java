import java.util.*;

public class Solution {
    public static void MinSum_MaxSum(int[] a) {
        long sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i : a) {
            sum += i;

            if (i < min) {
            min = i;
            }
            if (i > max) {
            max = i;
            }
        }

        long MinSum = sum - max;
        long MaxSum = sum - min;

        System.out.println(MinSum + " " + MaxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        MinSum_MaxSum(a);
    }
}
