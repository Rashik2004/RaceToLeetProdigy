class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int i=1;
        for(char ch: s.toCharArray()){
            int value = (26 - (ch - 'a')) * i;
            sum+=value;
            if(i<s.length()){
                i++;
            }
        }
        
        return sum;
    }
}