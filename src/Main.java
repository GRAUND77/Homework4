public class Main {
    public static void main(String[] args) {
        // Task 1

        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Task 2

        int clientDeviceYear = 2010;
        if(clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Task 3

        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " не год является високосным");
        }
        // Task 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + " 1 сутки");
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + " 2 суток");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + " 3 суток");
        }
        else if (deliveryDistance > 100){
            System.out.println("Доставка не производиться");
        }
        // Task 5

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("1 Месяц (он же январь) принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("2 Месяц (он же февраль) принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("3 Месяц (он же март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("4 Месяц (он же апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("5 Месяц (он же май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("6 Месяц (он же июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7 Месяц (он же июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8 Месяц (он же август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9 Месяц (он же сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10 Месяц (он же октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11 Месяц (он же ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12 Месяц (он же декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");}
    }
}