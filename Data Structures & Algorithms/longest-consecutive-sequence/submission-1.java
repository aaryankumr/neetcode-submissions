class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }
        Set<Integer> seq = new HashSet<>();
        for(int num : nums){
            seq.add(num);
        }
        int longStreak=0;
        for(int num: seq){
            if(!seq.contains(num-1)){
                int streak = 1;
                int count = 1;
                while(seq.contains(num+count)){
                    count++;
                    streak++;
                }
                longStreak = Math.max(longStreak, streak);
            }
            
        }
        return longStreak;
    }
}
