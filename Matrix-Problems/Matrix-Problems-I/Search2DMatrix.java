// Topic: Matrix I
// Problem: Search elements in 2D Matrix
// Description: Each row is sorted and first element of each rowis greater than last element of previous row.
// Approach: Binary Search
// Time Complexity: O(log(m*n))
// Space Complexity: O(1)

class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0, high = rows * cols - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
