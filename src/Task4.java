import java.util.Scanner;

public class Task4 {
    public static void  main(String[] args) {
        inputString();
    }

    public static void inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        if (str.equals("")) {
            System.err.println("Вы не ввели строку");
            inputString();
        } else {
            System.out.println("Вы ввели строку: " + str);
        }
    }
}

