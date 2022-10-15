class Solution {

    public int repeatedStringMatch(String a, String b) {
        if (b == "") return 0;
        String str = a;
        int repeat = b.length() / a.length();
        int count = 1;
        for (int i = 0; i < repeat + 2; i++) {
            if (a.contains(b)) return count;
            a = a + str;
            count++;
        }
        return -1;
    }
}
