import java.util.Scanner; // Импорт сканера консоли
public class Homework {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    public static int getData(String text) { // Получение данных от пользователя.
        System.out.print(text);  // Вывод в консоль запроса
        return input.nextInt(); // Считывание данных
    }

    public static int triangularNumber(int num) {
        int result = (1/2)*num*(num+1);
        return result;
    }

}
