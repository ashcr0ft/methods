import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        findLeapYear(2024);
        byte clientOS = 1;
        short clientDeviceYear = 2024;
        suggestVersion(clientOS, clientDeviceYear);
        short deliveryDistance = 12;
        if (deliveryDistance > 100) {
            System.out.println("Cвыше 100 км доставки нет.");
        } else {
            short deliveryDays = calculateDelivery(deliveryDistance);
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static void findLeapYear(int year) {
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void suggestVersion(byte clientOS, short clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }

        }
    }

    public static short calculateDelivery(short deliveryDistance) {
        short deliveryDays = 1;
        if (deliveryDistance < 20) {
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = (short) (deliveryDays + 1);
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = (short) (deliveryDays + 2);
        }
        return deliveryDays;
    }
}

