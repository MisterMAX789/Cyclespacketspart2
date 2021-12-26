package ru.netology.stats;

public class StatsService {
    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
            result += item;
        }
        return result;
    }

    public long avg(long[] items) {
        return sum(items) / items.length;
    }

    public long monthWithMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;

            }
        }
        int monthCount = 0;
        int monthWithMax = 0;
        for (long item : items) {
            monthCount++;
            if (item == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }

    public long monthWithMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (item < min) {
                min = item;

            }
        }
        int monthCount = 0;
        int monthWithMin = 0;
        for (long item : items) {
            monthCount++;
            if (item == min) {
                monthWithMin = monthCount;
            }
        }
        return monthWithMin;
    }

    public long monthWithMoreThanAvg(long[] items) {
        long avg = avg(items);
        int monthsCount = 0;
        for (long item : items) {
            if (item > avg) {
                monthsCount++;

            }
        }
        return monthsCount;
    }

    public long monthWithLessThanAvg(long[] items) {
        long avg = avg(items);
        int monthsCount = 0;
        for (long item : items) {
            if (item < avg) {
                monthsCount++;

            }
        }
        return monthsCount;
    }
}
