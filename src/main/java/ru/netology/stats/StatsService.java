package ru.netology.stats;

public class StatsService {
    public int calculateMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;

    }

    public long calculateAverageSales(long[] sales) {
        long sum = calculateSumSales(sales);
        long average = sum / sales.length;

        return average;
    }

    public long calculateAverageLessSales(long[] sales) {
        long average = calculateAverageSales(sales);
        long lessAverage = 0;
        int i = 0;
        for (; i < sales.length; i++) {
            if (sales[i] < average) {
                lessAverage++;
            }
        }
        return lessAverage;
    }

    public long calculateAverageAboveSales(long[] sales) {
        long average = calculateAverageSales(sales);
        long aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;

    }
}
