import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        List<String> list = new ArrayList<>();



        while (true) {
            System.out.println("Выберите операцию: \n1 - Добавить \n2 - Показать \n3 - Удалить \n4 - Поиск");
            int inputoperation = scanner.nextInt();

            if (inputoperation == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String pokupka = scanner1.nextLine();
                list.add(pokupka);
                System.out.println("Итого в списке покупок: " + list.size());

            }
            if (inputoperation == 2) {
                System.out.println("Список покупок: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));

                }
            }
            if (inputoperation == 3) {
                System.out.println("Список покупок: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название.");
                String delete = scanner2.nextLine();
                try {
                    int deleteNumber = Integer.parseInt(delete);
                    System.out.println("Покупка " + list.get(deleteNumber - 1) + " удалена, список покупок: ");
                    list.remove(deleteNumber - 1);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + " " + list.get(i));
                    }

                } catch (NumberFormatException e) {
                    list.remove(delete);
                    System.out.println("Покупка " + delete + " удалена, список покупок: ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + " " + list.get(i));
                    }
                }
            }
            if (inputoperation == 4) {
                System.out.println("Введите текст для поиска");
                String search = scanner3.nextLine();
                System.out.println("Найдено:");
                String queryLower = search.toLowerCase();

                for (int i = 0; i < list.size(); i++) {
                    String itemLower = list.get(i).toLowerCase();
                    if (itemLower.contains(queryLower)) {
                        System.out.println((i + 1) + " " + list.get(i));
                    }
                }
            }
        }
    }
}