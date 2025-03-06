class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxSum = 0, currentSum = 0;

        // Step 1: Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        // Step 2: Use sliding window technique
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k]; // Add new element, remove old element
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed
        }

        // Step 3: Return the maximum average
        return maxSum / k;    
    }
}
