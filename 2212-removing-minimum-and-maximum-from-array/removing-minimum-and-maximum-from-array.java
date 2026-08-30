class Solution {
    public int minimumDeletions(int[] nums) {
        int maxIndex = 0;
        int minIndex = 0;
        for(int i =0 ; i<nums.length;i++){
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int first = Math.min(minIndex, maxIndex);
        int second = Math.max(minIndex, maxIndex);

        int removeFromLeft = second + 1;
        int removeFromRight = nums.length - first;
        int removeFromBoth = first + 1 + nums.length - second;

        return Math.min(removeFromLeft, Math.min(removeFromRight, removeFromBoth));
        
    }
}