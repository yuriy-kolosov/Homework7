public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 7");
        //
        System.out.println("          Задача 1");
        int total = 0;
        int totalTarget = 2459000;
        int depositMonthAdd = 15000;
        int monthNum = 1;
        while (total <= totalTarget) {
            total = total + total / 1000;
            total = total + depositMonthAdd;
            System.out.println("Месяц " + monthNum + ", сумма накоплений равна " + total + " рублей");
            monthNum++;
        }
        //
        System.out.println("          Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //
        System.out.println("          Задача 3");
        int yearNum = 1;
        int population = 12_000_000;
        int birthRate1000 = 17;
        int deathRate1000 = 8;
        while (yearNum <= 10) {
            System.out.println("Год " + yearNum++ + ", численность населения составляет " + population);
            population = population + (population / 1000 * (birthRate1000 - deathRate1000));
        }
        //
        System.out.println("          Задача 4");
        yearNum = 1;
        int depositSum = 15000;
        int depositRate = 7;
        while (depositSum <= 12_000_000) {
            System.out.println("Месяц " + yearNum++ + ", сумма накоплений равна " + depositSum);
            depositSum = depositSum + (depositSum * depositRate / 100);
        }
        System.out.println("Месяц " + yearNum + ", сумма накоплений равна " + depositSum);
        //
        System.out.println("          Задача 5");
        yearNum = 1;
        depositSum = 15000;
        depositRate = 7;
        while (depositSum <= 12_000_000) {
            if (yearNum % 6 == 0)
                System.out.println("Месяц " + yearNum + ", сумма накоплений равна " + depositSum);
            depositSum = depositSum + (depositSum * depositRate / 100);
            yearNum++;
        }
        //
        System.out.println("          Задача 6");
        monthNum = 1;
        yearNum = 9;
        depositSum = 15000;
        depositRate = 7;
        for (; monthNum <= yearNum * 12; monthNum++) {
            if (monthNum % 6 == 0) {
                System.out.println("Месяц " + monthNum + ", сумма накоплений равна " + depositSum);
            }
            depositSum = depositSum + (depositSum * depositRate / 100);
        }
        //
        System.out.println("          Задача 7");
        int fridayNum = 3;
        for (int monthDayNum = 1; monthDayNum <= 31; monthDayNum++) {
            if (monthDayNum == fridayNum) {
                System.out.println("Сегодня пятница, " + monthDayNum + "-ое число. Необходимо подготовить отчет");
                fridayNum += 7;
            }
        }
        //
        System.out.println("          Задача 8");
        int yearCurrent = 2023;
        int yearStartPeriod = yearCurrent - 200;
        int yearEndPeriod = yearCurrent + 100;
        for (i = 0; i <= yearEndPeriod; i += 79) {
            if (i >= yearStartPeriod)
                System.out.println(i);
        }
    }
}