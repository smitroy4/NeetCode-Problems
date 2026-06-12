public class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int n = nums1.length, m = nums2.length;
        long[] prod = new long[n * m];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prod[idx++] = 1L * nums1[i] * nums2[j];
            }
        }
        Arrays.sort(prod);
        return prod[(int)k - 1];
    }
}