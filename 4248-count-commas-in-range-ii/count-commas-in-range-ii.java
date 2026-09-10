class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long start_num = 1000;
        long comma_count =1;;
        while(start_num <= n){
            long end = start_num * 1000 - 1;
            if(end < start_num) end = n;
            long upper = Math.min(n,end);
            ans += (upper - start_num + 1) * comma_count;
            start_num *=1000;
            comma_count++;
        }
        return ans;
    }
}