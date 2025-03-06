class Solution {
    public int maxSubArray(int[] nums) {
        int localsum = 0;
        int globalsum = Integer.MIN_VALUE;
        
         for(int ele : nums){
            localsum = Math.max(localsum + ele, ele);
            globalsum = Math.max(localsum, globalsum);
         }
         return globalsum;
        
    }
}