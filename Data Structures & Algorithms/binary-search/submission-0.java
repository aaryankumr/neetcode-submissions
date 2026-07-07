class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
    int high = nums.length -1;

    while(low <= high){
        int middlePos = (low + high) / 2;
        int middleNum = nums[middlePos];

        if(middleNum == target){
            return middlePos;
        }
        else if(middleNum < target){
            low = middlePos +1;
        }
        else if(middleNum > target) {
            high = middlePos-1;
        }
        
    }
    return -1;

}

    
}
    