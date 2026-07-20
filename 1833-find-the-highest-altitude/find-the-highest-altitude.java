class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length + 1];

        prefix[0] = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            prefix[i + 1] = sum;
            max = Math.max(max, prefix[i + 1]);
        }

        return max;
    }
}