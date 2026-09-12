class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;

        for (int num = 100; num <= 998; num += 2) {
            int n = num;

            int a = n / 100;
            int b = (n / 10) % 10;
            int c = n % 10;

            int[] freq = new int[10];

            for (int digit : digits) {
                freq[digit]++;
            }

            if (freq[a] > 0) {
                freq[a]--;

                if (freq[b] > 0) {
                    freq[b]--;

                    if (freq[c] > 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}