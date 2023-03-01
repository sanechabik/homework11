import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    static public void task1() {
        System.out.println("Задача 1");

        int year = 2021;
        boolean yearLeap = isYearLeap(year);

        System.out.println(year + " год является " + isYearLeap(year));
    }

    public static void determineTypeOS(int type, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (type == 0) {
            if (deviceYear < currentYear) {
                System.out.println("IOS LIGHT");
            } else {
                System.out.println("IOS NORMAL");
            }
        } else if (type == 1) {
            if (deviceYear < currentYear) {
                System.out.println("ANDROID LIGHT");
            } else {
                System.out.println("ANDROID NORMAL");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        determineTypeOS(0, 2015);
    }

    public static int calculateTime(int distance) {
        if (distance <= 0 || distance > 100) {
            return -1;
        }
        int time = 1;
        if (distance >= 20) {
            ++time;
        }
        if (distance >= 60) {
            ++time;
        }
        return time;
    }

    public static void task3() {
        System.out.println("Задача 3");

        int distance = 70;
        int time = calculateTime(distance);
        System.out.println("Потребуется " +  time + " дней для " + distance + " км");
    }
}