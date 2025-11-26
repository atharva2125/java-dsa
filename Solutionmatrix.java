import java.util.*;

class Solutionmatrix {

    public int minSwapsToCenter(int[][] matrix) {
        int n = matrix.length;
        int center = n / 2;
        int maxVal = Integer.MAX_VALUE;
        int maxRow = 0, maxCol = 0;

        // Find max element & its coordinates
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < maxVal) {
                    maxVal = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Minimum swaps = row moves + column moves
        return Math.abs(maxRow - center) + Math.abs(maxCol - center);
    }

    public static void main(String[] args) {
        Solutionmatrix obj = new Solutionmatrix();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        int result = obj.minSwapsToCenter(matrix);

        System.out.println("Minimum swaps required: " + result);
    }
}
