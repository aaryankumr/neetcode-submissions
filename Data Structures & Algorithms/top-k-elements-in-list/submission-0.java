class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mapCount = new HashMap<>();
        for(int num: nums){
            mapCount.put(num, mapCount.getOrDefault(num,0)+1);

        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int key: mapCount.keySet()){
            int freq = mapCount.get(key);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
            
        }

        int [] result = new int[k];
        int index=0;
        for(int i = bucket.length-1; i >=0; i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    result[index++] = num;
                    if(index == k){
                    return result;
                }
                }

                
            }
            
        }
        return result;
        
        
    }
}
