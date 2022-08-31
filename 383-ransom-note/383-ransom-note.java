class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            m1.put(magazine.charAt(i), m1.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        boolean n = true;
        for (int j = 0; j < ransomNote.length(); j++) {
            int c = m1.getOrDefault(ransomNote.charAt(j), 0);
            if (c > 0) {
                m1.put(ransomNote.charAt(j), c - 1);
            } else {
                n = false;
            }
        }
        return (n);
    }
}
