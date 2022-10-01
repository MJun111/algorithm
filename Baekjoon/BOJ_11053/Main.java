import java.io.*;
import java.util.*;

public class Main {
    static int n, ans;
    static int[] A;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        A = new int[n];
        dp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    tmp = Math.max(tmp, dp[j]);
                }
            }
            dp[i] = tmp + 1;
            ans = Math.max(ans, dp[i]);
        }

        System.out.println(ans);
    }
}
