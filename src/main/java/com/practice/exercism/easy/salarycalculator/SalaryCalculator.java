package com.practice.exercism.easy.salarycalculator;

public class SalaryCalculator {

    private static final double SALARY = 1000.00;
    private static final double MAX_SALARY = 2000.00;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return finalSalary < MAX_SALARY ? finalSalary : MAX_SALARY;
    } 
}