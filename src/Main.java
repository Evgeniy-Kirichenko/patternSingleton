import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        List<Integer> source = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int sizeList;
        int max;
        int filterData;
        logger.log("Запуск программы");
        logger.log("Просим пользователя ввести исходные данные");

        System.out.println("Введите исходные данные");
        System.out.println("Введите размер списка:");
        sizeList = sc.nextInt();
        System.out.println("Введите верхнюю границу значений:");
        max = sc.nextInt();
        logger.log("Создаем и наполняем список");

        for (int i = 0; i < sizeList; i++) {
            source.add(rd.nextInt(max));
        }

        printList(source, "Вот случайный список:");
        logger.log("Просим пользователя ввести данные для фильтрации");
        System.out.println("Введите порог для фильтрации");
        filterData = sc.nextInt();
        Filter filter = new Filter(filterData);
        result = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        printList(result, "Отфильтрованный список:");
        logger.log("Завершаем программу");


    }

    public static void printList(List<Integer> list, String msg) {
        System.out.print(msg + " ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }
}
