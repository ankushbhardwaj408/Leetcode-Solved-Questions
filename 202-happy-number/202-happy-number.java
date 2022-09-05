class Solution {
    public boolean isHappy(int n) {
//         HashSet<Integer> ans=new HashSet<>();
//         int sum=0;
//         while(n!=1){
//             if(!ans.contains(n))
//             {
//                 ans.add(n);
//             }else{
//                 return false;
//             }
//             sum=0;
//             while(n!=0){
                
//             int m=n%10;
//             sum+=m*m;
//                 n=n/10;
//             }
//             n=sum;
//         }
//         return true;
        
        int s=n;
        int f=n;
        do{
            s=sqrt(s);
            f=sqrt(sqrt(f));
            
        }while(s!=f);
        if(s==1) return true;
        return false;
        
    }
    
    public int sqrt(int num)
    {
        int ans=0;
        while(num>0)
        {
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}