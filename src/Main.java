import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    public static void checkYearAsLeap(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год - это високосный год!");
        } else {
            System.out.println(year + " год - это НЕ високосный год!");
        }
    }

    public static void checkPhone(int os, int year) {
        if (os == 1) {
            if (year >= 2022) {
                System.out.println("Установите версию приложения для Android по ссылке: ");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
            }
        } else if (os == 0) {
            if (year >= 2022) {
                System.out.println("Установите версию приложения для iOS по ссылке: ");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");
            }
        }
    }

    public static int calculationDeliveryDays(int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if ((distance - 20) % 40 != 0) {
            deliveryDays = 2 + (distance - 20) / 40;
        } else {
            deliveryDays = 1 + (distance - 20) / 40;
        }
        return deliveryDays;
    }


    public static void task1() {
        System.out.println("Задание 1. Реализуйте метод, который получает в качестве параметра год, проверяет является ли он високосным и выводит результат в консоль.");
        int year = 2024;
        System.out.println("Переменная year имеет значение: " + year + " год.");
        checkYearAsLeap(year);
    }

    public static void task2() {
        System.out.println("Задание 2. Напишите метод, в который подаются тип ОС (0 — iOS, 1 — Android ) и год выпуска устройства. Если устройство старше текущего года, предложите ему установить облегченную версию.");
        int clientOs = 0;
        //int clientDeviceYear = 2005;
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = currentYear;
        System.out.println("Переменная clientOs имеет значение: " + clientOs);
        System.out.println("Переменная clientDeviceYear имеет значение: " + clientDeviceYear);
        checkPhone(clientOs, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задание 3. Напишите метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки банковской карты.");
        int deliveryDistance = 141;
        System.out.println("Расстояние от офиса банка до адреса доставки: " + deliveryDistance + " км.");
        System.out.println("Потребуется " + calculationDeliveryDays(deliveryDistance) + " дней.");
    }
}