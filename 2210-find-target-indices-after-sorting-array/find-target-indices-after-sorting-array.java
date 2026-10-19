class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int less=0, count=0;
        for(int num:nums){
            if(num<target) less++;
            else if(num==target) count++;
        }
        List<Integer> result =  new ArrayList<>(count);
        for(int i=0;i<count;i++){
            result.add( less + i);
        }
        return result;
    }
}