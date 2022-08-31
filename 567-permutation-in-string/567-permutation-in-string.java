class Solution {

    public boolean checkInclusion(String s1, String s2) {
        HashMap<Integer, Integer> m1 = new HashMap<>(26);

        for (int i = 0; i < s1.length(); i++) {
            int x = s1.charAt(i) - 'a';
            m1.put(x, m1.getOrDefault(x, 0) + 1);
        }
        for (int j = 0; j < s2.length() - s1.length() + 1; j++) {
            int z = j;
            int t = s1.length();
            HashMap<Integer, Integer> m2 = new HashMap<>(26);
            while (t != 0) {
                int x = s2.charAt(z) - 'a';
                m2.put(x, m2.getOrDefault(x, 0) + 1);
                t--;
                z++;
            }
            if (m1.equals(m2)) return true;
        }
        return false;
    }
}
