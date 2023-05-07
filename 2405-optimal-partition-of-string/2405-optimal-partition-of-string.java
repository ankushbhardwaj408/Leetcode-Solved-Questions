class Solution {
    static int ans=Integer.MAX_VALUE;
    public int partitionString(String s) {
        if(s.length()==0)return 0;
      int count=1;
        
      
        HashSet<Character> letter =new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(letter.contains(s.charAt(i))){
                letter.clear();
                count ++;
            }
            letter.add(s.charAt(i));
        }
        return count;
    }
  
    }
