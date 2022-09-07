class Solution {

    public int getXORSum(int[] arr1, int[] arr2) {
        // int ans=0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr1.length; i++) {
            a ^= arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            b ^= arr2[j];
        }
        return a & b;
    }
}
