package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();
        int[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sum(items);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAvg() {
        StatsService service = new StatsService();
        int[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.avg(items);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnMonthWithMax() {
        StatsService service = new StatsService();
        int[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthWithMax(items);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnMonthWithMin() {
        StatsService service = new StatsService();
        int[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthWithMin(items);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnMonthCountWithMoreThanAvg() {
        StatsService service = new StatsService();
        int[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthWithMoreThanAvg(items);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnMonthCountWithLessThanAvg() {
        StatsService service = new StatsService();
        int[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthWithLessThanAvg(items);

        assertEquals(expected, actual);

    }
}