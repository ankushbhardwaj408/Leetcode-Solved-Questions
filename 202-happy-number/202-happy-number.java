class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ans=new HashSet<>();
        int sum=0;
        while(n!=1){
            if(!ans.contains(n))
            {
                ans.add(n);
            }else{
                return false;
            }
            sum=0;
            while(n!=0){
                
            int m=n%10;
            sum+=m*m;
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}