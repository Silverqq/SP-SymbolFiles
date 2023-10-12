import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindSymbols {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Shor\\IdeaProjects\\silver\\src\\24_demo.txt"; // Путь к текстовому файлу

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();

            int maxLength = 0;
            int currentLength = 0;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == 'X') {
                    currentLength++;
                } else {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 0;
                }
            }

            maxLength = Math.max(maxLength, currentLength);

            System.out.println("Длина самой длинной последовательности символов X: " + maxLength);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}