public class Q1_MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = m - n - 1; 
        int j = n - 1;  

        int k = m - 1;  

        
        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k] = X[i];
                i--;
            } else {
                X[k] = Y[j];
                j--;
            }
            k--;
        }

        
        while (j >= 0) {
            X[k] = Y[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        Arrays.sort(X);
        mergeArrays(X, Y);

        System.out.print("Merged Array X[]: {");
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i]);
            if (i < X.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

