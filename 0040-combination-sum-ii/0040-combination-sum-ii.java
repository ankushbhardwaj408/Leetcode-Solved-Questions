class Solution {

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fun(0, target, ans, nums, list, 0);

        return ans;
    }

    public void fun(int sum, int target, List<List<Integer>> ans, int[] nums, List<Integer> list, int i) {
        if (sum == target) {
          
            if (!ans.contains(new ArrayList(list))) {
                ans.add(new ArrayList(list));
            }

            return;
        }
        if (sum > target) {
            return;
        }
        for (int start = i; start < nums.length; start++) {
            if(start>i && nums[start]==nums[start-1])continue;
            list.add(nums[start]);
            fun((sum + nums[start]), target, ans, nums, list, start + 1);

            list.remove(list.size() - 1);
        }
    }
}
