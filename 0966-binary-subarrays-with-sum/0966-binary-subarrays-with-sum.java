public class Solution {  
    public int numSubarraysWithSum(int[] A, int S) {  
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();  
        prefixSumCount.put(0, 1);  
        
        int currentSum = 0;  
        int count = 0;  
        
        for (int num : A) {  
            currentSum += num;  
            if (prefixSumCount.containsKey(currentSum - S)) {  
                count += prefixSumCount.get(currentSum - S);  
            }  
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);  
        }  
        
        return count;  
    }  
}