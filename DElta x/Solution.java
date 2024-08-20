public class Solution {

    public int MinJumps(int[] arr) {
        if (arr.length <= 1) return 0;  // If the array has 0 or 1 element, no jump is needed.
        if (arr[0] == 0) return -1;  // If the first element is 0, you can't make any jump.

        int maxReach = arr[0];  // The farthest index we can currently reach
        int steps = arr[0];     // Steps we can still take
        int jumps = 1;          // Number of jumps needed to reach maxReach

        for (int i = 1; i < arr.length; i++) {
            // Check if we've reached the end of the array
            if (i == arr.length - 1) return jumps;

            // Update maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use a step to move to the next index
            steps--;

            // If no steps are left
            if (steps == 0) {
                jumps++;  // We must have used a jump

                // Check if the current index/position is beyond the maxReach
                if (i >= maxReach) return -1; // Cannot move further

                // Re-initialize steps to the amount of steps to reach maxReach from position i
                steps = maxReach - i;
            }
        }

        return -1; // In case reaching the end is not possible
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; // Example array
        System.out.println(sol.MinJumps(arr));  // Expected output: 3
    }
}
