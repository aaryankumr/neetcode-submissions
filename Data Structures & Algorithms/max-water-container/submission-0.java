class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right =heights.length - 1;
        int maxWater =0;
        while(left < right){
            int width = right - left;
            int heightt = Math.min(heights[left], heights[right]);
            int currentArea = width * heightt;

            maxWater = Math.max(maxWater, currentArea);

            if(heights[left] > heights[right]){
                right--;

            }
            else{
                left++;
            }
        }
        return maxWater;
        
        
    }
}
