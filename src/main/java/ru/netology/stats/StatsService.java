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
        for (int m = 0; m < sales.length; m++) {
            if (sales[m] >= sales[maxMonth]) {
                maxMonth = m;
            }
        }
        return maxMonth + 1;
    }

    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (int s = 0; s < sales.length; s++) {
            sum += sales[s];
        }
        return sum;

    }

    public long calculateAverageSales(long[] sales) {
        long sum = calculateSumSales(sales); ;
        long average = sum / sales.length;

        return average;
    }

    public long calculateAverageLessSales(long[] sales) {
        long average = calculateAverageSales(sales);
        long lessAverage = 0;
        for (int l = 0; l < sales.length; l++) {
            if (sales[l]< average) {
                lessAverage++;
            }
        }
        return lessAverage;
    }

    public long calculateAverageAboveSales(long[] sales) {
        long average = calculateAverageSales(sales);
        long aboveAverage = 0;
        for (int a = 0; a < sales.length; a++) {
            if (sales[a]< average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}