package ru.netology.stats;

public class StatsService {

    // 1/ Сумма всех продаж.
    public int SalesAmount(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц.
    public int AverageSalesAmount(int[] sales) {
        int AverageSum = SalesAmount(sales);
        return AverageSum / sales.length;
    }

    //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    public int MaxSalesAmount(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int MinSalesAmount(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего.
    public int MinAverageSalesAmount(int[] sales) {
        int month = 0;
        for (int i : sales) {
            if (i < AverageSalesAmount(sales)) {
                month++;
            }
        }
        return month;
    }

    // 6. Количество месяцев, в которых продажи были выше среднего.
    public int MaxAverageSalesAmount(int[] sales) {
        int month = 0;
        for (int i : sales) {
            if (i > AverageSalesAmount(sales)) {
                month++;
            }
        }
        return month;
    }
}

