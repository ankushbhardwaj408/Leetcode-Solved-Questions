class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (dn(i)) ans.add(i);
        }
        return ans;
    }

    boolean dn(int num) {
        int c = num;
        while (c != 0) {
            int m = c % 10;
            if (m == 0) return false;
            if (num % m != 0) return false;
            c = c / 10;
        }
        return true;
    }
}
