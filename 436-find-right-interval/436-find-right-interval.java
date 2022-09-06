class Solution {

    public static int[] findRightInterval(int[][] intervals) {
        int[] s = new int[intervals.length];
        int[] ans = new int[intervals.length];
        int i = 0;

        for (int[] x : intervals) {
            s[i++] = x[0];
        }

        for (int j = 0; j < intervals.length; j++) {
            int index = Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            boolean sup = false;
            for (int k = 0; k < s.length; k++) {
                if (s[k] >= intervals[j][1]) {
                    sup = true;
                    min = Math.min(min, s[k]);
                    if (s[k] == min) {
                        index = k;
                    }
                }
            }
            if (index == Integer.MAX_VALUE) {
                index = -1;
            }
            ans[j] = index;
        }

        return ans;
    }
}
