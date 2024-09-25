import java.util.Arrays;
import java.util.Comparator;

public class task3 {

    public static void main(String[] args) {
        int n = 4; // Розмір матриці (можна змінити)
        int[][] matrix = {{1, 2, -3, 4},
                {5, -6, 7, 8},
                {-9, 10, 11, 12},
                {13, 14, -15, 16}};

        int maxSum = Integer.MIN_VALUE;
        int minInMaxSumColumn = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(matrix[i][j]);
            }

            if (sum > maxSum) {
                maxSum = sum;

                final int maxSumIndex  = j;
                minInMaxSumColumn = Arrays.stream(matrix).map((row) -> row[maxSumIndex]).min(Comparator.naturalOrder()).get();
            }
        }

        System.out.println("Найменше значення в стовпці з найбільшою сумою модулів: " + minInMaxSumColumn);
    }
}