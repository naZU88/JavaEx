/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
повторно запросить у пользователя ввод данных.

Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю
должно показаться сообщение, что пустые строки вводить нельзя.
*/

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        secondTask();
    }

    public static void secondTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
        if (line.length() == 0){
            throw new RuntimeException("Пустую строку вводить нельзя");
        }
    }

    public static float firstTask() {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        float fnumber = 0;
        while(flag) {
            System.out.println("Укажите число:");
            String number = scanner.nextLine();
            try {
                fnumber = Float.valueOf(number);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Укажите верное число:");
            }
        }
        return fnumber;
    }
}

