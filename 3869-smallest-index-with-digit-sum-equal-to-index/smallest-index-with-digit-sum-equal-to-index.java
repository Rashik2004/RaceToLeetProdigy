class Solution {
    private int sum(int a){
        int sum =0;
        int num = a;
        while(num>0){
            int temp = num%10;
            sum+=temp;
            num = num/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i == sum(nums[i])){
                return i;
            }
        }
        return -1;
    }
}