class Solution {
    public String largestNumber(int[] nums) {
        String[] s=new String[nums.length];
        int i=0;
        for(int x:nums)
        {
            s[i++]= String.valueOf(x);
        }
     Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
    StringBuilder ans=new StringBuilder();
        for(String d:s)
        {
         ans.append(d);
        }
        String result=ans.toString();
     return result.startsWith("0")? "0": result;
    }
}