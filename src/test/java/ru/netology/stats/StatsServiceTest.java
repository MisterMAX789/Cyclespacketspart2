package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(items);
        long expected = 180;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAvg() {
        StatsService service = new StatsService();
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.avg(items);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthWithMax() {
        StatsService service = new StatsService();
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthWithMax(items);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthWithMin() {
        StatsService service = new StatsService();
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthWithMin(items);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthWithMoreThanAvg() {
        StatsService service = new StatsService();
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthWithMoreThanAvg(items);
        long expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateMonthWithLessThanAvg() {
        StatsService service = new StatsService();
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthWithLessThanAvg(items);
        long expected = 5;
        assertEquals(expected, actual);
    }
}