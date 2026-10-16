class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 0){
            return -1;
        }

        int el=0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(cnt == 0){
                cnt++;
                el = nums[i];
            }
            else if( el == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        int cnt1 =0;
        for(int  i =0; i < nums.length; i++){
            if(el == nums[i]){
                cnt1++;
            }

        }
        return cnt1 > nums.length/2 ? el: -1;
        
    }
}