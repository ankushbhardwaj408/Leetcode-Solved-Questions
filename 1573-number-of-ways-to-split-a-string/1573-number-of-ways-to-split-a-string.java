class Solution {

    public int numWays(String s) {
        long ones = 0;
        long n = s.length();
        long MOD = 1_000_000_007;
        for (char c : s.toCharArray()) {
            ones += c - '0';
        }

        if (ones == 0) return (int) (((n - 1) * (n - 2)) / 2 % MOD);
        if (ones % 3 != 0) return 0;
        long ot = ones / 3;
        ones = 0;
        long ways1 = 0;
        long ways2 = 0;
        for (char c : s.toCharArray()) {
            ones += c - '0';
            if (ones == ot) ways1++;
            if (ones == 2 * ot) ways2++;
        }
        return (int) ((ways1 * ways2) % MOD);
    }
}
