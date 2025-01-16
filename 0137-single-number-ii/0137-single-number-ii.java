class Solution {
  public int singleNumber(int[] nums) {
    int ans = 0;
    int n=32;

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for ( int num : nums)

               sum += num >> i & 1;
      sum %= 3;

      ans |= sum << i;
    }

    return ans;
  }
}