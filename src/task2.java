public class task2 {

    public static void main(String[] args) {
        // Ініціалізація масиву A(n)
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3; // Число позицій  для зсуву

        // Виклик методу для зсуву масиву
        int[] shiftedArray = shiftArrayRight(A, k);

        // Виведення результату
        for (int num : shiftedArray) {
            System.out.print(num + " ");
        }
    }

    // Метод для зсуву масиву вправо на k позицій
    public static int[] shiftArrayRight(int[] A, int k) {
        int n = A.length;
        int[] B = new int[n]; // Новий масив для зберігання результату

        // Заповнення нового масиву
        for (int i = 0; i < n; i++) {
            B[(i + k) % n] = A[i]; // Використовуємо операцію модуля, щоб уникнути виходу індексу за межі масиву
        }

        return B; // Повернення зсунутого масиву
    }
}


