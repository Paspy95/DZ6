package ru.netology.stats;

public class StatsService {
    public int arraySum(int[] sales) {
        int allSales = 0;
        for (int sale : sales) {
            allSales = allSales + sale;
        }
        return allSales;
    }

    public int averageAmountOfSales(int[] sales) {
        int averageMonth = arraySum(sales);
        return arraySum(sales) / 12;
    }

    public int peakSalesMonth(int[] sales) {
        int peakMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[peakMonth] <= sales[i]) {
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int sumMonthlowSales(int[] sales) {
        int averageSales = averageAmountOfSales(sales);
        int monthLowSales = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                monthLowSales++;
            }
        }
        return monthLowSales;
    }

    public int sumMonthHighSales(int[] sales) {
        int averageSales = averageAmountOfSales(sales);
        int monthLowSales = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                monthLowSales++;
            }
        }
        return monthLowSales;
    }
}
