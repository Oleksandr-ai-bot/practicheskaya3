import java.util.Scanner;

public class Kumquat_task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // давайте введемо трохи інформації ось наприклад сторони трикутника 😊
        System.out.print("Введіть довжину першої сторони: ");
        int a = scanner.nextInt();
        System.out.print("Введіть довжину другої сторони: ");
        int b = scanner.nextInt();
        System.out.print("Введіть довжину третьої сторони: ");
        int c = scanner.nextInt();

        // Перевіримо, чи можемо ми побудувати трикутник з цими сторонами 🧐
        if (a + b > c && a + c > b && b + c > a) {
            // О! Трикутник можна побудувати, давайте подивимось, який він 😉
            if (a == b && b == c) {
                System.out.println("Трикутник рівносторонній.");
            } else if (a == b || a == c || b == c) {
                // Схоже, цей трикутник має дві рівні сторони 🤓
                System.out.println("Трикутник рівнобедрений.");
            } else {
                // А ось цей трикутник має різні сторони, різнобічний трикутник 🧐
                System.out.println("Трикутник різнобічний.");
            }
        } else {
            // Ох, схоже трикутник не може існувати з такими сторонами 😅
            System.out.println("Трикутник не може існувати.");
        }
    }
}
