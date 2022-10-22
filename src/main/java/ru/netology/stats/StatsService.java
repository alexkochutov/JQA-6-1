package ru.netology.stats;

public class StatsService {

    public float salesSummary(float[] sales) {
        float sum = 0;
        for (float sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public float salesAverage(float[] sales) {
        return salesSummary(sales) / sales.length;
    }

    public int maxMonth(float[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max;
    }

    public int minMonth(float[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min;
    }

    public int lessAverage(float[] sales) {
        int monthsCount = 0;
        float average = salesAverage(sales);
        for (float sale : sales) {
            if (sale < average) {
                monthsCount++;
            }
        }
        return monthsCount;
    }

    public int moreAverage(float[] sales) {
        int monthsCount = 0;
        float average = salesAverage(sales);
        for (float sale : sales) {
            if (sale > average) {
                monthsCount++;
            }
        }
        return monthsCount;
    }
}