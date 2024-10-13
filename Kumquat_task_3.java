import java.util.Scanner;

public class Kumquat_task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Просимо ввести початковий та кінцевий диапазон 😊
        System.out.print("Введіть початкове значення диапазону: ");
        int start = scanner.nextInt();
        System.out.print("Введіть кінцеве значення диапазону: ");
        int end = scanner.nextInt();

        // Тепер запитаємо просте число від 1 до 9. Не забувай, тільки просте! 😎
        System.out.print("Введіть просте число від 1 до 9: ");
        int kumquat = scanner.nextInt();

        // Перевіряємо чи введено коректне просте число 😏
        if (kumquat < 1 || kumquat > 9 || (kumquat != 2 && kumquat != 3 && kumquat != 5 && kumquat != 7)) {
            System.out.println("Некоректне число! Введіть просте число від 1 до 9.");
            return;
        }

        // Починаємо цикл for для виведення значень у диапазоні, крім кратних введеному простому числу 🤓
        System.out.println("Виводимо числа у диапазоні від " + start + " до " + end + ", виключаючи кратні числу " + kumquat + ":");
        for (int egg = start; egg <= end; egg++) {
            // Якщо число кратне простому числу, пропускаємо його : )
            if (egg % kumquat == 0) {
                continue; // Пропускаємо це число і йдемо далі 😏
            }
            System.out.println(egg);
        }
    }
}
