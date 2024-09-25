import java.util.HashSet;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        // Розділяємо текст на слова, ігноруючи розділові знаки
        String[] words = text.split("[\\s\\p{Punct}]+");

        System.out.println("Слова з унікальними буквами:");
        for (String word : words) {
            if (hasUniqueLetters(word)) {
                System.out.println(word);
            }
        }
    }

    // Перевірка, чи всі букви в слові унікальні
    private static boolean hasUniqueLetters(String word) {
        HashSet<Character> seenChars = new HashSet<>();
        for (char c : word.toCharArray()) {
            // Переводимо всі символи в нижній регістр, щоб уникнути проблем із регістром
            c = Character.toLowerCase(c);
            if (seenChars.contains(c)) {
                return false;  // Якщо буква повторюється, слово не підходить
            }
            seenChars.add(c);
        }
        return true;  // Усі букви унікальні
    }
}

