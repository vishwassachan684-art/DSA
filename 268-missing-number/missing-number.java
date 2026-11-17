class Solution {
    public int missingNumber(int[] nums) {
      int len = nums.length;
      int sum =0;
      for(int i=0;i<len;i++){
        sum = sum + nums[i];
      } 
      int missing = (len*(len+1))/2 - sum;
      return missing;
    }
}