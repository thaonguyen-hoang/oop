package javabasics.lab00.input;

import java.util.Scanner;

public class PensionContributionCalculator {
    final static int SALARY_CEILING = 6000;
    final static double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final static double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final static double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final static double EMPLOYER_RATE_55_TO_60 = 0.13;
    final static double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final static double EMPLOYER_RATE_60_TO_65 = 0.09;
    final static double EMPLOYEE_RATE_ABOVE_65 = 0.05;
    final static double EMPLOYER_RATE_ABOVE_65 = 0.075;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        int salary = scan.nextInt();
        System.out.print("Enter the age: ");
        int age = scan.nextInt();
        scan.close();

        double employeeContribution = employeeContribution(age, salary);
        double employerContribution = employerContribution(age, salary);
        double totalContribution = employeeContribution + employerContribution;

        System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
        System.out.printf("The total contribution is: $%.2f\n", totalContribution);
    }

    private static int contributableSalary(int salary) {
        return Math.min(salary, SALARY_CEILING);
    }

    public static double employeeContribution(int age, int salary) {
        double employeeContribution;
        if (age <= 55) {
            employeeContribution = contributableSalary(salary) * EMPLOYEE_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            employeeContribution = contributableSalary(salary) * EMPLOYEE_RATE_55_TO_60;
        } else if (age <= 65) {
            employeeContribution = contributableSalary(salary) * EMPLOYEE_RATE_60_TO_65;
        } else {
            employeeContribution = contributableSalary(salary) * EMPLOYEE_RATE_ABOVE_65;
        }
        return employeeContribution;
    }

    public static double employerContribution(int age, int salary) {
        double employerContribution;
        if (age <= 55) {
            employerContribution = contributableSalary(salary) * EMPLOYER_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            employerContribution = contributableSalary(salary) * EMPLOYER_RATE_55_TO_60;
        } else if (age <= 65) {
            employerContribution = contributableSalary(salary) * EMPLOYER_RATE_60_TO_65;
        } else {
            employerContribution = contributableSalary(salary) * EMPLOYER_RATE_ABOVE_65;
        }
        return employerContribution;
    }
}
