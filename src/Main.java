import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();


        while (true) {
            System.out.println("Выберите операцию: \n1 - Добавить \n2 - Показать \n3 - Удалить \n4 - Поиск");

            String input = scanner.nextLine();
            int inputoperation = Integer.parseInt(input);

            if (inputoperation == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String purchase = scanner.nextLine();
                list.add(purchase);
                System.out.println("Итого в списке покупок: " + list.size());

            }
            if (inputoperation == 2) {
                System.out.println("Список покупок: ");
                shoppingList(list);
            }
            if (inputoperation == 3) {
                System.out.println("Список покупок: ");
                shoppingList(list);
                System.out.println("Какую хотите удалить? Введите номер или название.");
                String delete = scanner.nextLine();
                try {
                    int deleteNumber = Integer.parseInt(delete);
                    System.out.println("Покупка " + list.get(deleteNumber - 1) + " удалена, список покупок: ");
                    list.remove(deleteNumber - 1);
                    shoppingList(list);

                } catch (NumberFormatException e) {
                    list.remove(delete);
                    System.out.println("Покупка " + delete + " удалена, список покупок: ");
                    shoppingList(list);
                }
            }
            if (inputoperation == 4) {
                System.out.println("Введите текст для поиска");
                String search = scanner.nextLine();
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

    private static void shoppingList(List ArrayList) {
        for (int i = 0; i < ArrayList.size(); i++) {
            System.out.println((i + 1) + " " + ArrayList.get(i));
        }
    }
}