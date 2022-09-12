class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String str="";
            for(int j=0;j<words[i].length();j++)
            {
            int x=(int)(words[i].charAt(j)-'a');  
str+=s[x];
            }
            if(!ans.contains(str)){
                ans.add(str);
            }
        }
        return ans.size();
    }
}