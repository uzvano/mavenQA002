package ru.netology.services;

public class MonthService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // сумма денег на счете

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Планируем отдыхать
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}


