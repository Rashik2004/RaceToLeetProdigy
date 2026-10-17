class Solution {
    private int sumDigit(int num){
        int sum=0;
        while(num>0){
            int temp = num%10;
            sum+=temp;
            num=num/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] helper = new int[n][3];
        for (int i = 0; i < n; i++) {
            helper[i][0] = sumDigit(nums[i]);
            helper[i][1] = nums[i];
            helper[i][2] = i;
        }
        Arrays.sort(helper, (a, b) ->
            a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );

        int[] targetPos = new int[n];
        for (int i = 0; i < n; i++) {
            targetPos[helper[i][2]] = i;
        }
        boolean[] visited = new boolean[n];
        int swaps = 0;
        
        for (int i = 0; i < n; i++) {
            if (visited[i] || targetPos[i] == i) {
                continue; 
            }
            
            int cycleLength = 0;
            int current = i;
            while (!visited[current]) {
                visited[current] = true;
                current = targetPos[current];
                cycleLength++;
            }
            swaps += cycleLength - 1;
        }
        return swaps;
    }
}
