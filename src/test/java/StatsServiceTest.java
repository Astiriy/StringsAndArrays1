import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test // 1. Сумма всех продаж.
    public void SalesAmount() {
        StatsService service = new StatsService();

        int expectedSum = 180;
        int actual = service.SalesAmount(sales);

        Assertions.assertEquals(expectedSum, actual);
    }

    @Test // 2. Средняя сумма продаж в месяц.
    public void AverageSalesAmount() {
        StatsService service = new StatsService();

        int expectedAverageSum = 15;
        int actual = service.AverageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSum, actual);

    }

    @Test //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    public void MaxSalesAmount() {
        StatsService service = new StatsService();

        int expectedMaxMonth = 7;
        int actual = service.MaxSalesAmount(sales);

        Assertions.assertEquals(expectedMaxMonth, actual);
    }

    @Test //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму.
    public void MinSalesAmount() {
        StatsService service = new StatsService();

        int expectedMinMonth = 8;
        int actual = service.MinSalesAmount(sales);

        Assertions.assertEquals(expectedMinMonth, actual);
    }

    @Test //5. Количество месяцев, в которых продажи были ниже среднего.
    public void MinAverageSalesAmount() {
        StatsService service = new StatsService();

        int expectedMinAverageMonth = 5;
        int actual = service.MinAverageSalesAmount(sales);

        Assertions.assertEquals(expectedMinAverageMonth, actual);
    }

    @Test // 6. Количество месяцев, в которых продажи были выше среднего.
    public void MaxAverageSalesAmount() {
        StatsService service = new StatsService();

        int expectedMaxAverageMonth = 5;
        int actual = service.MaxAverageSalesAmount(sales);

        Assertions.assertEquals(expectedMaxAverageMonth, actual);
    }
}
