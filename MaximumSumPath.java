import java.util.ArrayList;
import java.util.List;

public class MaximumSumPath {
    public static int findMaxSumPath(int[] X, int[] Y, List<Integer> maxSumPath) {
        int sumX = 0, sumY = 0, result = 0;
        int i = 0, j = 0;
        int m = X.length, n = Y.length;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                i++;
            } else if (X[i] > Y[j]) {
                sumY += Y[j];
                j++;
            } else { // Common element found
                result += Math.max(sumX, sumY) + X[i]; // Add the common element to result
                maxSumPath.add(X[i]); // Add common element to max sum path
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements from X or Y
        while (i < m) {
            sumX += X[i];
            i++;
        }

        while (j < n) {
            sumY += Y[j];
            j++;
        }

        result += Math.max(sumX, sumY); // Add remaining sum

        return result;
    }

    public static void main(String[] args) {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };

        List<Integer> maxSumPath = new ArrayList<>();
        int maxSum = findMaxSumPath(X, Y, maxSumPath);
        
        // Print the maximum sum path
        System.out.print("The maximum sum path is: ");
        for (int i = 0; i < maxSumPath.size(); i++) {
            System.out.print(maxSumPath.get(i));
            if (i < maxSumPath.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
        
        // Print the maximum sum value
        System.out.println("The maximum sum is: " + maxSum);
    }
}

