package hackerrank;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public interface Company {
    void assignSalaries(int[] salaries);
    void averageSalary();
    void maxSalary();
    void minSalary();
}

class EngineerFirm implements Company {
    int[] income;
    String employee;

    EngineerFirm(int n) {
        income = new int[n];
        for (int i = 0; i < income.length; i++) {
            income[i] = 0;
        }
        this.employee = "engineers";
    }


    public void assignSalaries(int[] salaries) {
        int length = Math.min(income.length, salaries.length);

        for (int i = 0; i < length; i++) {
            income[i] = salaries[i];
        }

        System.out.println("Incomes of " + employee + " credited");
    }

    public void averageSalary() {
        int sum = 0;
        for (int i = 0; i < income.length; i++) {
            sum += income[i];
        }

        double average = (double) sum / income.length;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Average salary of " + employee + " is " + df.format(average));
    }

    public void maxSalary(){
        int max = income[0];
        for (int i = 1; i < income.length; i++) {
            if (income[i] > max) {
                max = income[i];
            }
        }

        System.out.println("Maximum salary amongst " + employee + " is " + max);
    }

    public void minSalary(){
        int min = income[0];
        for (int i = 1; i < income.length; i++) {
            if (income[i] < min) {
                min = income[i];
            }
        }

        System.out.println("Minimum salary amongst " + employee + " is " + min);
    }

}

class AccountantFirm extends EngineerFirm {
    AccountantFirm(int n) {
        super(n);
        this.employee = "accountants";
    }

    @Override
    public void assignSalaries(int[] salaries) {
        super.assignSalaries(salaries);
    }


    public void averageSalary(){
        super.averageSalary();
    }

    public void maxSalary(){
        super.maxSalary();
    }

    public void minSalary(){
        super.minSalary();
    }
}

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] count = sc.nextLine().split(" ");

        EngineerFirm e = new EngineerFirm(Integer.parseInt(count[0]));
        AccountantFirm a = new AccountantFirm(Integer.parseInt(count[1]));

        count = sc.nextLine().split(" ");

        int[] incomeEngineers = new int[count.length];
        for (int i=0; i < count.length; i++) {
            incomeEngineers[i] = Integer.parseInt(count[i]);
        }
        e.assignSalaries(incomeEngineers);

        count = sc.nextLine().split(" ");
        int[] incomeAccountants = new int[count.length];
        for (int i=0; i < count.length; i++) {
            incomeAccountants[i] = Integer.parseInt(count[i]);
        }
        a.assignSalaries(incomeAccountants);

        e.averageSalary();
        e.maxSalary();
        e.minSalary();

        a.averageSalary();
        a.maxSalary();
        a.minSalary();
    }
}

