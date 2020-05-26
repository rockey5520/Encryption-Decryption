import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        Time time = new Time();
        time.hour = 12;
        time.minute = 0;
        time.second = 0;
        return time;
    }

    public static Time midnight() {
        Time time = new Time();

        time.hour = 0;
        time.minute = 0;
        time.second = 0;

        return time;
    }

    public static Time ofSeconds(long seconds) {
        Time time = new Time();

        int secondsInMinute = 60;
        int minutesInHour = 60;
        int hourInDay = 24;

        long secondsPerDay = hourInDay * secondsInMinute * minutesInHour;

        long neededTime = seconds - (seconds / secondsPerDay) * secondsPerDay;

        time.hour = (int) neededTime / (secondsInMinute * minutesInHour);
        time.minute = ((int) neededTime - secondsInMinute * minutesInHour * time.hour) / secondsInMinute;
        time.second = (int) neededTime - secondsInMinute * minutesInHour * time.hour - secondsInMinute * time.minute;

        return time;
    }

    public static Time of(int hour, int minute, int second) {
        Time time = new Time();

        boolean neededHour = hour >= 0 && hour <= 23;
        boolean neededMinute = minute >= 0 && minute <= 59;
        boolean neededSecond = second >= 0 && second <= 59;

        if (neededHour && neededMinute && neededSecond) {
            time.hour = hour;
            time.minute = minute;
            time.second = second;

            return time;
        }

        return null;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}