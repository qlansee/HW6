import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        if (first == second && second == third) {
            System.out.println("Все веса равны!");
        } else {

            double greatest;
            double average;
            double smallest;

            if (first > second && first > third) {
                greatest = first;
            } else if (second > first && second > third) {
                greatest = second;
            } else {
                greatest = third;
            }

            if (first < second && first < third) {
                smallest = first;
            } else if (second < first && second < third) {
                smallest = second;
            } else {
                smallest = third;
            }

            if (first != greatest && first != smallest) {
                average = first;
            } else if (second != greatest && second != smallest) {
                average = second;
            } else {
                average = third;
            }


            System.out.println("Наибольший вес: " + greatest);
            System.out.println("Средний вес: " + average);
            System.out.println("Наименьший вес: " + smallest);

        }
    }
}