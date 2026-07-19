import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int r = nums1.length + nums2.length;
        int[] a = new int[r];
        int f = 0;

        for (int i = 0; i < nums1.length; i++) {
            a[f++] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            a[f++] = nums2[j];
        }

        Arrays.sort(a);

        if (r % 2 == 0) {
            return (a[r / 2] + a[(r / 2) - 1]) / 2.0;
        } else {
            return a[r / 2];
        }
    }
}
