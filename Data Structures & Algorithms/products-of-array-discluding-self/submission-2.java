class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Step 1: Calculate the left products.
        // output[i] will contain the product of all elements to the left of nums[i]
        output[0] = 1; // There are no elements to the left of the first element
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Step 2: Calculate the right products on the fly and multiply with left products.
        // We use a variable to keep track of the running product of elements to the right.
        int rightProduct = 1; // There are no elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            // The final result is the left product (already in output[i]) * right product
            output[i] = output[i] * rightProduct;
            
            // Update the running right product for the next iteration (moving leftwards)
            rightProduct *= nums[i];
        }
        
        return output;
    }
}