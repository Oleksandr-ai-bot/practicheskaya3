import java.util.Random;
import java.util.Scanner;

public class Kumquat_task_2 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Генеруємо випадкове число від 1 до 100. Спокійно, ми знаємо відповідь 😉
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        // Почнемо гру з циклу do-while, тому що ми хочемо хоча б одну спробу 🤓
        do {
            System.out.print("Вгадайте число від 1 до 100: ");
            guess = scanner.nextInt();
            attempts++;

            // Перевіряємо, чи наше число більше або менше ніж вгадане користувачем 😏
            if (guess < targetNumber) {
                System.out.println("Загадане число більше. Спробуйте ще раз!");
            } else if (guess > targetNumber) {
                System.out.println("Загадане число менше. Спробуйте ще раз!");
            } else {
                System.out.println("Вітаємо! Ви вгадали число за " + attempts + " спроб(и)!");

            }

        } while (guess != targetNumber); // Повторюємо, поки не вгадаємо 🎯


        // Тепер реалізуємо те ж саме через цикл while  🤓
        System.out.println("\nЗараз перезапустимо гру через цикл while 😎");
        targetNumber = random.nextInt(100) + 1; // Генеруємо нове число
        attempts = 0;
        guess = 0;


        while (guess != targetNumber) {
            System.out.print("Спробуйте ще раз вгадати число від 1 до 100: ");
            guess = scanner.nextInt();
            attempts++;

            // Ті ж самі перевірки, що й раніше, але тепер через цикл while 😁
            if (guess < targetNumber) {
                System.out.println("Загадане число більше. Спробуйте ще раз!");
            } else if (guess > targetNumber) {
                System.out.println("Загадане число менше. Спробуйте ще раз!");
            } else {
                System.out.println("Круто! Ви вгадали число за " + attempts + " спроб(и)!");
            }
        }
    }
}
