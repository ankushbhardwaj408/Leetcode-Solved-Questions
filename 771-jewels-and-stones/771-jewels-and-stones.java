class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    List<Character> ans=new ArrayList<>();
        for(int i=0;i<jewels.length();i++)
        {
            ans.add(jewels.charAt(i));
        }
        int answer=0;
        for(int j=0;j<stones.length();j++)
        {
            if(ans.contains(stones.charAt(j))) answer++;
        }
        return answer;
        }
}