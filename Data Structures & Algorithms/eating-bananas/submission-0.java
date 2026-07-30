class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right =1;
        for(int pile: piles){
            right =  Math.max(right, pile);
        }
        int result = right;

        while(left <=right){
            int totalHours = 0;
            int mid = left + (right-left)/2;

            for(int pile : piles){
                totalHours += (pile + mid-1) / mid;
            }

            if( totalHours <= h){

                right = mid -1;
                result = mid;
            } 
            else{
                left = mid +1;
            }
        }
        return result;
    }
}
