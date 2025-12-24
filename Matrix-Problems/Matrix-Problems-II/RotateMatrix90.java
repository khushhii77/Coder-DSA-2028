// Topic: Matrix II
// Problem: Rotate Image by 90 Degrees
// Description:Rotate matrix clockwise in-place.
// Approach: Transpose + Reverse rows
// Time Complexity: O(n*n)
// Space Complexity: O(1)

class RotateMatrix90 {

    static void rotate(int[][] matrix) {
        int n = matrix.length;

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
