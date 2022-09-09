class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            h.add(allowed.charAt(i));
        }
        int ans = 0;
        for (String x : words) {
            boolean an = true;
            for (int i = 0; i < x.length(); i++) {
                if (!h.contains(x.charAt(i))) {
                    an = false;
                }
            }
            if (an) {
                ans++;
            }
        }
        return ans;
    }
}
