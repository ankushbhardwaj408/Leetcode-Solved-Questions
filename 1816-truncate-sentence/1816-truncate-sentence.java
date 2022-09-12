class Solution {

    public String truncateSentence(String s, int k) {
        int y = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') y++;
        }
        if (y < k) return s;
        int ans = 0;
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            x = i;
            if (s.charAt(i) == ' ' && ans == k - 1) {
                break;
            } else if (s.charAt(i) == ' ') {
                ans++;
            }
        }
        return s.substring(0, x);
    }
}
