class Solution {
    public int maxSubArray(int[] nums) {
        
        int len = nums.length;
        
        int max = nums[0];
        int temp = max;

        for(int i=1;i<len;i++){
            max = Math.max(max+nums[i], nums[i]);
            temp = Math.max(temp, max);
        }
       
       return temp;
    }
}