package by.yandex.sidvlada;

public class Day {

    private static Day day;
    private final int second;
    private final int minute;
    private final int hour;

    public Day(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public int CountSecond() {
        return hour * 60 * 60 + minute * 60 + second;
    }

    @Override
    public String toString() {
        return second + " " + minute + " " + hour;
    }


    public static Day getAll(int second, int minute, int hour) {
        if (day == null) {
            day = new Day(second, minute, hour);
        }
        return day;
    }

    public int compareTo(Day comp) {
        final int hourComparison = Integer.compare(hour, comp.hour);
        if (hourComparison != 0) {
            return hourComparison;
        }
        final int minuteComparison = Integer.compare(minute, comp.minute);
        if (minuteComparison != 0) {
            return minuteComparison;
        }
        final int secondComparison = Integer.compare(second, comp.second);
        if (secondComparison != 0) {
            return secondComparison;
        }
        return hourComparison;
    }
}
