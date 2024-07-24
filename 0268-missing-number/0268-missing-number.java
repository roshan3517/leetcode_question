class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for (int i = 0; i <= n; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}