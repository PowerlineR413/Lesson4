import java.util.Scanner;

/**
 * @author El Baron 15.02.2023
 */
public class Main {
    public static void main(String[] args) {
        /*int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        String f = "Строковая переменная";

        char g = 'a';
        char h = 'b';

        Integer i = 10;

        double j = 36.6;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);*/


        //Калькулятор

        System.out.println("Введите первое число");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Введите знак необходимой операции");
        System.out.println("* для умножения");
        System.out.println("/ для деления");
        System.out.println("- для вычитания");
        System.out.println("+ для прибавления");
        String znak = new Scanner(System.in).nextLine();
        if (znak.contains("*")){
            double result = a * b;
            System.out.println("Результат: " + result);
        }
        if (znak.contains("/")){
            double result = a / b;
            System.out.println("Результат: " + result);
        }
        if (znak.contains("-")) {
            double result = a - b;
            System.out.println("Результат: " + result);
        }
        if (znak.contains("+")) {
            double result = a + b;
            System.out.println("Результат: " + result);
        }

















    }
}
