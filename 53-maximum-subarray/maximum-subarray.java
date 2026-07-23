class Solution {
    public int maxSubArray(int[] nums) {
        
        int len = nums.length;
        int[] max = new int[len];
        max[0] = nums[0];
        int temp = max[0];

        for(int i=1;i<len;i++){
            max[i] = Math.max(max[i-1]+nums[i], nums[i]);
            temp = Math.max(temp, max[i]);
        }
       
       return temp;
    }
}