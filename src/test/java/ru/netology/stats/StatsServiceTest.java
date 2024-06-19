
package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void SalesServiceMinMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calculateMinMonth(sales);
        long expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void SalesServiceMaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calculateMaxMonth(sales);
        long expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ElementsSumSalesService() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
            long actual = service.calculateSumSales(sales);
            long expected = 180;
            Assertions.assertEquals(actual, expected);
        }

        @Test
    public void AmountServiceSaleAverage() {
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        StatsService service = new StatsService();
        long actual = service.calculateAverageSales(sales);
        long expected = 15;
        Assertions.assertEquals(actual,expected);
        }

        @Test
    public void SalesBelowLessAverage() {
        long[] sales = {18,15,13,15,17,20,19,20,7,14,14,18};
        StatsService service = new StatsService();
        long actual = service.calculateAverageLessSales(sales);
        long expected = 4 ;
        Assertions.assertEquals(actual,expected);

        }

        @Test
    public void SalesBelowAboveAverage() {
        long[] sales = {18,15,13,15,17,20,19,20,7,14,14,18};
        StatsService service = new StatsService();
        long actual = service.calculateAverageAboveSales(sales);
        long expected = 4 ;
        Assertions.assertEquals(actual,expected);

        }
    }


