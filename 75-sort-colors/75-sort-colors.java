class Solution {

    public void sortColors(int[] nums) {
        boolean swap = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(j, j + 1, nums);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
