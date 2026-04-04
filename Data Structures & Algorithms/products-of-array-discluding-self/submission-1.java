class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];

        // Use 'j' as the index for the element we are finding the answer for
        for (int j = 0; j < nums.length; j++) {
            int res = 1;
            // Use 'i' as the index we are multiplying
            for (int i = 0; i < nums.length; i++) {
                // Compare INDICES, not values. Skip if we are at the exact same position.
                if (i != j) { 
                    res = res * nums[i];
                }
            }
            result[j] = res;
        }
        return result;
    }
}