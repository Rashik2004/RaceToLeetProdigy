class Solution {
    
    public String reverseVowels(String s) {
        char[] chArr = s.toCharArray();
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(!isVowel(chArr[i])){
                i++;
            }
            else if(!isVowel(chArr[j])){
                j--;
            }else{
                char temp = chArr[i];
                chArr[i] = chArr[j];
                chArr[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(chArr);
    }
    private boolean isVowel(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }else{
            return false;
        }
    }
}