package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MonthServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void testCalculateVacationMonths(int expected, int income, int expenses, int threshold) {
        MonthService service = new MonthService();

        int actual = service.calculateVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}