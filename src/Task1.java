/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
 * повторно запросить у пользователя ввод данных.
 */


import java.util.Scanner;

public class Task1 {
    public static void  main(String[] args) {
        inputNumber();
    }

    public static void inputNumber() {
        float number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");

        if (scanner.hasNextFloat()) {
            number = scanner.nextFloat();
            System.out.println(number);

        } else {
            System.err.println("Это не число");
            inputNumber();
        }
    }
}