package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldReturnSalesSummary() {
        StatsService service = new StatsService();
        float[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        float expected = 180;
        float actual = service.salesSummary(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSalesAverage() {
        StatsService service = new StatsService();
        float[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        float expected = 15;
        float actual = service.salesAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMaxMonth() {
        StatsService service = new StatsService();
        float[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 7;
        int actual = service.maxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinMonth() {
        StatsService service = new StatsService();
        float[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 8;
        int actual = service.minMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthsCountLessThanAverage() {
        StatsService service = new StatsService();
        float[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 5;
        int actual = service.lessAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthsCountMoreThanAverage() {
        StatsService service = new StatsService();
        float[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 5;
        int actual = service.moreAverage(sales);
        assertEquals(expected, actual);
    }
}