import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<String, List<String>> phonBook = new HashMap<>();
        phonBook.put("Лена", List.of("8 926 333 33 33", "8 926 222 22 99"));
        phonBook.put("Дима", List.of("8 926 333 33 55", "8 926 222 22 00"));
        phonBook.put("Петр", List.of("8 926 333 33 66", "8 926 222 22 44"));
        phonBook.put("игорь", List.of("8 926 333 33 77", "8 926 222 22 11"));
        phonBook.put("Ира", List.of("8 926 333 33 88", "8 926 222 22 22"));

        menu(phonBook);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void find(Map<String, List<String>> phonBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phonBook.get(name));
    }

    public static void allBook(Map<String, List<String>> phonBook) {
        System.out.println(phonBook);

    }

    public static Map<String, List<String>> add(Map<String, List<String>> phonBook) {
        System.out.println("Если хотите выйте хотите перестать вводить номера введите 'стоп'");
        System.out.println("Введите имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String phon = scanner();
            if (phon.equals("стоп")) {
                break;
            } else {
                number.add(phon);
            }
        }
        phonBook.put(name, number);

        return phonBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) {
        System.out.println(
                "Введите команду из списка: 1 - найти контакт, 2 - добавить контакт, 3 - показать всю телефонную книгу, 4 - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("4")) {
                break;
            } else {
                switch (comands) {
                    case "1":
                        find(phonBook);
                        break;
                    case "2":
                        add(phonBook);
                        break;
                    case "3":
                        allBook(phonBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phonBook;
    }
}