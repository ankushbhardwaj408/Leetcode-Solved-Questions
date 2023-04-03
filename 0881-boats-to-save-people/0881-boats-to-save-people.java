class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        if(people[0]>limit)return people.length;
        int i=0;
        int j=people.length-1;
        int ans=0;
        while(i<=j)
        {
            if(i==j && people[i]< limit)
            {
                ans++;
                return ans;
            }
            if(people[i]>=limit)
            {
                ans=ans+(j-i)+1;
                return ans;
            }else if(people[j]>=limit)
            {
                ans++;
                j--;
            }else if(people[i]+people[j]>limit)
            {
                ans++;
                j--;
            }else if(people[i]+people[j]<=limit)
            {
                ans++;
                i++;
                j--;
            }
            
        }
        return ans;
    }
}