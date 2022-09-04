class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> h=new HashSet();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length())
        {
            if(!h.contains(s.charAt(j)))
            {
                h.add(s.charAt(j));
                j++;
                max=Math.max(h.size(),max);
                
            }
            else{
                h.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}