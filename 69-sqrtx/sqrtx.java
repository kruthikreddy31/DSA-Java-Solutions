class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Avoid overflow
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1; // try for a bigger answer
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}