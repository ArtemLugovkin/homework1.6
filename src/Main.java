public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.");


        char clientOS = '1';
        if (clientOS == '0') {
            System.out.println(" Установите версию приложения для IOS по ссылке.");
        } else {
            if (clientOS == '1') {
                System.out.println(" Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println(" Задание 2.");

        char clientsOS = '0';
        char yearOfRelease = 2014;
        if (clientsOS == '0') {
            System.out.println(" Установите версию приложения для IOS по ссылке.");
            if (yearOfRelease <= 2015) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientsOS == '1') {
                System.out.println(" Установите версию приложения для Android по ссылке");
            }
                if (yearOfRelease >= 2016) {
                    System.out.println(" Установите облегченную версию приложения для Android по ссылке");
                }
            }

        System.out.println( " Задание 3");

        int year = 2021;
        System.out.println("year");
        if (year % 4 = 0 && year % 100 ≠ 0 || year % 400 = 0){
            System.out.println( year + " является високосным годом");
        } else {
            System.out.println( year + " не является високосным годом");
        }


        System.out.println( " Задание 4 ");

        int deliveryDistance = 95;
        int plusADayOfDelivery = 60 - 20;
        System.out.println( plusADayOfDelivery + " дополнительно км доставки, за сутки. " );

        if ( deliveryDistance <= 20) {
            System.out.println( " Потребуется 1 день доставки" );
        }
        if (deliveryDistance >=21 && deliveryDistance <= 60) {
            System.out.println(" Потребуется 2 дня для доставки.");
        } else if (deliveryDistance >=61 && deliveryDistance <= 100) {
            System.out.println(" Потребуется 3 дня для доставки.");
        }

        System.out.println(" Задание 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зимний сезон");
                break;
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
                System.out.println("Весенний сезон");
                break;
            case 4:
                System.out.println("Весенний сезон");
                break;
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
                System.out.println("Летний сезон");
                break;
            case 7:
                System.out.println("Летний сезон");
                break;
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
                System.out.println("Осенний сезон");
                break;
            case 10:
                System.out.println("Осенний сезон");
                break;
            case 11:
                System.out.println("Осенний сезон");
                break;
            case 12:
                System.out.println("Зимний сезон");
                break;
            default:
                System.out.println("Такого сезона еще не открыли!");
        }













        }
}