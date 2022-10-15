class Solution {

    public int nextGreaterElement(int n) {
        if (check(n)) return -1;

        String temp = Integer.toString(n);
        String temp2;

        int[] ans = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            if (i != temp.length()) {
                temp2 = temp.substring(i, i + 1);
            } else {
                temp2 = temp.substring(i);
            }
            ans[i] = Integer.parseInt(temp2);
        }

        int p = ans.length - 2;
        while (p >= 0 && ans[p] >= ans[p + 1]) p--;
        if (p >= 0) {
            int q = ans.length - 1;
            while (q >= 0 && ans[q] <= ans[p]) q--;
            swap(ans, p, q);
        }

        rev(ans, p + 1, ans.length - 1);

        int answer = 0;
        for (int m : ans) {
            answer = answer * 10 + m;
        }
        if (answer > n) return answer;
        if (answer == n) return n;
        return -1;
    }

    public void rev(int[] nums, int i, int j) {
        while (i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public boolean check(int n) {
        int r = n % 10;
        while (n != 0) {
            int rem = n % 10;
            if (rem != r) return false;
            n = n / 10;
        }
        return true;
    }
}
