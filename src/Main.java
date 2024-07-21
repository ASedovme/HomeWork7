public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 7");

//Задача1
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        do {
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        } while (total <= 2_459_000);

//Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
//Задача 3
        System.out.println("Задача 3");
        int y = 12_000_000;
        int birth = 17;
        int death = 8;
        i = 1;
        for (; i <= 10; i++) {
            y = y + (y / 1000) * birth - (y / 1000) * death;
            System.out.println("Год " + i + ", численность населения составляет " + y);
        }
//Задача 4
        System.out.println("Задача 4");
        int q = 0;
        deposit = 15000;
        month = 1;
        do {
            q = q + q * 7 / 100 + deposit;
            System.out.println("Месяц " + month + ", накопление " + q + " рублей");
            month++;
        } while (q <= 12_000_000);

//Задача 5
        System.out.println("Задача 5");
        q = 0;
        deposit = 15000;
        month = 1;
        for (; q <= 12_000_000; month++) {
            q = q + q * 7 / 100 + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопление " + q + " рублей");
            }
        }
//Задача 6
        System.out.println("Задача 6");
        q = 0;
        deposit = 15000;
        month = 1;
        for (; month <= 108; month++) {
            q = q + q * 7 / 100 + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопление " + q + " рублей");
            }
        }
//Задача 7
        System.out.println("Задача 7");
        int d = 1;
        int w = 3;
        while (d <= 31) {
            if (w % 5 == 0) {
                System.out.println("Сегодня пятница, " + d + "-е число");
                d++;
                w++;
            }
            if (w < 7) {
                d++;
                w++;
            } else {
                d++;
                w = 1;
            }
        }
//Задача 8
        System.out.println("Задача 8");
        int year = 0;
        while (year <= 2124) {
            if (year >= 1824) {
                System.out.println(year);
            }
            year = year + 79;
        }
    }
}