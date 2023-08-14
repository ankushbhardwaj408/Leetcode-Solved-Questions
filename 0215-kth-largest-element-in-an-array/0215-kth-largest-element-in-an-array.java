class Solution {
    public int findKthLargest(int[] nums, int k) {
       
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int num : nums) {
            maxHeap.offer(num);
        }
        
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        
        return maxHeap.peek();
        // Arrays.sort(nums);
        // return nums[nums.length-k];
      
    }
}