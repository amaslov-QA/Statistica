package ru.netology.Statistic.ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class statisticServiceTest {
    @Test
    public void shouldSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        statisticService service = new statisticService();

        int actual = statisticService.sum(purchases);
        int expected = 180;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        statisticService service = new statisticService();

        int actual = statisticService.avg(purchases);
        int expected = 15;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        statisticService service = new statisticService();

        int actual = statisticService.monthWithMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        statisticService service = new statisticService();

        int actual = statisticService.monthWithMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthWithMoreAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        statisticService service = new statisticService();

        int actual = statisticService.monthWithMoreThanAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthWithLessAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        statisticService service = new statisticService();

        int actual = statisticService.monthWithLessAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);

    }
}