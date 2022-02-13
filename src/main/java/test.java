import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, x, z;
        System.out.println("Введите первое число а: ");
        a = in.nextDouble();
        System.out.println("Выберите операцию " +
                "1 - Сложение  " +
                "2 - Вычитание  " +
                "3 - Умножение  " +
                "4 - Деление");
        z = in.nextDouble();
        System.out.println("Введите второе число b: ");
        b = in.nextDouble();

        if (z == 1){
            x = (a+b);
            System.out.printf("Результат: " + x );
        }
        else if (z == 2) {
            x = a-b;
            System.out.printf("Результат: " + x);
        }
        else if (z == 3) {
            x = a*b;
            System.out.printf("Результат: " + x);
        }
        else if (z == 4) {
            x = a/b;
            System.out.printf("Результат: " + x);
        }
        else System.out.print("Ошибка. неправильный код операции");
    }}