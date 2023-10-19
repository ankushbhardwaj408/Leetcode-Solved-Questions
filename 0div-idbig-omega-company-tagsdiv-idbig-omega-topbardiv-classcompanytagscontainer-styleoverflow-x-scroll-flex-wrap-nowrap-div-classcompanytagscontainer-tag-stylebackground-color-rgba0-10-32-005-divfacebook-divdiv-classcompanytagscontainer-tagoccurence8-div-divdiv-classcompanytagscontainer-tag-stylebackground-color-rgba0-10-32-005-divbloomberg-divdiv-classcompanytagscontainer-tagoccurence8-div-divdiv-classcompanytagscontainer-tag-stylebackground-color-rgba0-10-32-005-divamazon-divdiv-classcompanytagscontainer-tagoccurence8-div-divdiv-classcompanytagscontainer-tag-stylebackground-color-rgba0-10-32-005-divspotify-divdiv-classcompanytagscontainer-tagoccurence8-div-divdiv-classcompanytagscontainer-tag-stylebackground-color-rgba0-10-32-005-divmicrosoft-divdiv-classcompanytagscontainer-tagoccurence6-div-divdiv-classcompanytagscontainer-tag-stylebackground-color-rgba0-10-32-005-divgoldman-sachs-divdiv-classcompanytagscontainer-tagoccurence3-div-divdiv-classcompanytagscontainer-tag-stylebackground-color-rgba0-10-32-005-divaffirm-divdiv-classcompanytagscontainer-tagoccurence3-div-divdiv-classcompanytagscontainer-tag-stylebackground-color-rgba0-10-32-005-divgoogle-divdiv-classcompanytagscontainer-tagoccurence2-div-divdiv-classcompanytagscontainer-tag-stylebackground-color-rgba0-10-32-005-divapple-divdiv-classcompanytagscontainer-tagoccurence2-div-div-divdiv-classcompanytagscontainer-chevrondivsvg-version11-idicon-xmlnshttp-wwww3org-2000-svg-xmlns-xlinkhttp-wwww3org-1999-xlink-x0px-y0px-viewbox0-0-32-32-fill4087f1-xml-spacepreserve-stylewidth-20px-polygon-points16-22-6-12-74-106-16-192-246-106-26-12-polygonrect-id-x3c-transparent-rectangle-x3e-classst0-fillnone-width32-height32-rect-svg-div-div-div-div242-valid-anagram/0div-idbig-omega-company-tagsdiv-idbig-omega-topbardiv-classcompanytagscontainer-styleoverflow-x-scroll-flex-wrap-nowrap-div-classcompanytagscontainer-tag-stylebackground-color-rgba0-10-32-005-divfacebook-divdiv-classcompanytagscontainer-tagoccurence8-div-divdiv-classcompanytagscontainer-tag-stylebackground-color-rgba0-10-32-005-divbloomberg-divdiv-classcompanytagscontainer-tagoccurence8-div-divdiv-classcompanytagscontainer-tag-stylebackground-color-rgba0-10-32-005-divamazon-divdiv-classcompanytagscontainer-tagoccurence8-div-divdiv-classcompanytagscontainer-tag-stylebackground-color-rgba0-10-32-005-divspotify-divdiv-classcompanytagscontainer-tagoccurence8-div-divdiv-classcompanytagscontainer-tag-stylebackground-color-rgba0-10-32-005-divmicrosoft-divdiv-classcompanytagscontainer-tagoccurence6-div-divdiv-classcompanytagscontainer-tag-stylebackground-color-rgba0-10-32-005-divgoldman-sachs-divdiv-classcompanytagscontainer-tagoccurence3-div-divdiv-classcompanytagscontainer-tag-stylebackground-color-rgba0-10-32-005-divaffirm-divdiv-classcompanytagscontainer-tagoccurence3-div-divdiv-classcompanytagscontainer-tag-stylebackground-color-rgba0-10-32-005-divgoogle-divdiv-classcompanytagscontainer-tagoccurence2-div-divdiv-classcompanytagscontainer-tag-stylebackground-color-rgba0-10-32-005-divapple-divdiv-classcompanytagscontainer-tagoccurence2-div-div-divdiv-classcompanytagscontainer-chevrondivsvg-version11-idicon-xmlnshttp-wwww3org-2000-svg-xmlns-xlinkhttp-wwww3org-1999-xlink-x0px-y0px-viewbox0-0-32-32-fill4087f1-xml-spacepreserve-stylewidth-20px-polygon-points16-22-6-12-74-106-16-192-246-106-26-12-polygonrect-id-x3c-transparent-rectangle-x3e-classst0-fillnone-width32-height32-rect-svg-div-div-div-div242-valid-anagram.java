class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            map1.put(a,map1.getOrDefault(a,0)+1);
            char b=t.charAt(i);
            map2.put(b,map2.getOrDefault(b,0)+1);
        }
        return map1.equals(map2);
    }
}