class Solution {

    public int countPrimes(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;

        boolean[] ans = new boolean[n + 1];
        int x = prime(n, ans);

        return x;
    }

    public int prime(int n, boolean[] ans) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!ans[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    ans[j] = true;
                }
            }
        }
        int c = 0;
        for (int k = 2; k < n; k++) {
            if (!ans[k]) c++;
        }
        return c;
    }
}
