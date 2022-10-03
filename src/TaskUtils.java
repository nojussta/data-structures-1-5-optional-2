public class TaskUtils {
    public static int[] SlidingWindowMaximum(int[] A, int K) {
        int n = A.length;
        if (n * K == 0) return new int[0];
        if (K == 1) return A;

        int[] left = new int[n];
        left[0] = A[0];
        int[] right = new int[n];
        right[n - 1] = A[n - 1];
        for (int i = 1; i < n; i++) {
            if (i % K == 0) left[i] = A[i];
            else left[i] = Math.max(left[i - 1], A[i]);

            int j = n - i - 1;
            if ((j + 1) % K == 0) right[j] = A[j];  // block_end
            else right[j] = Math.max(right[j + 1], A[j]);
        }

        int[] output = new int[n - K + 1];
        for (int i = 0; i < n - K + 1; i++)
            output[i] = Math.max(left[i + K - 1], right[i]);

        return output;
    }
}
