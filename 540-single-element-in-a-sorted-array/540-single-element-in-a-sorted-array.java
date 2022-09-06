class Solution {

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int x = sort(nums, 0, nums.length);
        return x;
    }

    public static int sort(int[] nums, int s, int e) {
        int mid = s + (e - s) / 2;
        if (mid == 0) {
            if (nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
        }
        if (mid == nums.length - 1) {
            if (nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
        }
        if ((e - s) == 1) return -1;

        if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
            return nums[mid];
        }
        int x = sort(nums, s, mid);
        int y = sort(nums, mid, e);
        return Math.max(x, y);
    }
}
