class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2) return "";
        HashSet<Character> ans=new HashSet<>();
        for(char c :s.toCharArray())
        {
            ans.add(c);
        }
        for(int i=0;i<s.length();i++)
        {
            if(ans.contains(Character.toUpperCase(s.charAt(i))) && ans.contains(Character.toLowerCase(s.charAt(i))))  
                continue;
            
                String s1=longestNiceSubstring(s.substring(0,i));
                String s2=longestNiceSubstring(s.substring(i+1));
             return (s1.length()>=s2.length())?s1:s2;
        }
       return s;
    }
}