import java.util.Scanner; // Импорт сканера консоли
public class Homework {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num = getData("Введите номер треугольного числа: ");
        int result = triangularNumber(num);
        outputResult("Треугольным числом под номером " + num + " является " + result);

    }

    public static int getData(String text) { // Получение данных от пользователя.
        System.out.print(text);  // Вывод в консоль запроса
        return input.nextInt(); // Считывание данных
    }

    public static int triangularNumber(int num) { // Вычисление n-го треугольного числа
        int result = (num*(num+1))/2;
        return result;
    }

    public static void outputResult(String text) { // Вывод результата в консоль
        System.out.println(text);
    }

}
