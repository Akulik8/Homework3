import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку (для завершения введите 'end'): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end") || input.equals("End") || input.equals("END")) {
                break;
            }
            strings.add(input);
        }
        System.out.println("Вы ввели следующие строки:");
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            System.out.println(str);
        }
    }
}