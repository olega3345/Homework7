public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int purpose = 2_459_000;
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= purpose) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(" " + start);
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for (int i = 1; i <= 10; i++) {
            population += population * dif / 1200;
        }
        System.out.println("Год 2033, численность населения составляет " + population + " человек");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bankDeposit = 15000;
        int total = 0;
        for (int i = 1; total <= 12000000; i++) {
            total = total + bankDeposit;
            total = total + (total / 100) * 7;
            System.out.println("Месяц " + i + " Сумма накоплений " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int bankDeposit = 15000;
        int total = 0;
        for (int i = 1; total <= 12000000; i++) {
            total = total + bankDeposit;
            total = total + (total / 100) * 7;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " Сумма накоплений " + total);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bankDeposit = 15000;
        int total = 0;
        int month = 12 * 9;
        for (int i = 1; i <= month; i++) {
            total = total + bankDeposit;
            total = total + (total / 100) * 7;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " Сумма накоплений " + total);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearsToday = 2023;
        for (int years = yearsToday - 200; years <= yearsToday + 100; years++) {
            if (years % 79 == 0) {
                System.out.println(years);
            }
        }
    }
}