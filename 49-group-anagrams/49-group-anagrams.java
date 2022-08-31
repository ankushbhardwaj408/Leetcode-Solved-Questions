class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> h=new HashMap<>();
        for(String current:strs)
        {
            char[] ch=current.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!h.containsKey(sorted))
            {
                h.put(sorted,new ArrayList<String>());
            }
            h.get(sorted).add(current);
        }
        ans.addAll(h.values());
        return ans;
    }
}