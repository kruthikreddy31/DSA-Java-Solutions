class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int n = customers.length;

        int gsum = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                gsum += customers[i];
                customers[i] = 0;
            }
        }

        int csum = 0;
        int max = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {

            csum += customers[i];

            if (i - j + 1 > minutes) {
                csum -= customers[j];
                j++;
            }

            max = Math.max(max, csum);
        }

        return gsum + max;
    }
}