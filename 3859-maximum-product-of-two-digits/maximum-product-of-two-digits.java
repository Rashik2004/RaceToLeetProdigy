class Solution {
    public int maxProduct(int n) {
        int maxProduct =1;
        int max = 0;
        int prevMax = 0;
        
        while(n>0){
            int digit = n%10;
            if (digit >= max) {
                prevMax = max;
                max = digit;
            } else if (digit > prevMax) {
                prevMax = digit;
            }
            n/=10;
        }
        return max*prevMax;
    }
}