import java.util.*;

public class q15{
    static final int MOD = 998244353;
    static int count;
    static int[] a, b, tempA, tempB;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            n = sc.nextInt();
            a = new int[n];
            b = new int[n];
            tempA = new int[n];
            tempB = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            count = 0;
            dfs(0);  // start backtracking
            System.out.println(count);
        }
        sc.close();
    }

    static void dfs(int idx) {
        if (idx == n) {
            // check if both tempA and tempB are sorted
            if (isSorted(tempA) && isSorted(tempB)) {
                count = (count + 1) % MOD;
            }
            return;
        }

        // Don't swap
        tempA[idx] = a[idx];
        tempB[idx] = b[idx];
        dfs(idx + 1);

        // Swap
        tempA[idx] = b[idx];
        tempB[idx] = a[idx];
        dfs(idx + 1);
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}

