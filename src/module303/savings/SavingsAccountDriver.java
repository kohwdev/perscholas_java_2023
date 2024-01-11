package module303.savings;

public class SavingsAccountDriver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        // 3% interest rate
        SavingsAccount.modifyInterestRate(0.03);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver1's new balance: %.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver2's new balance: %.2f\n", saver2.getSavingsBalance());

        // 4% interest rate
        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver1's new balance: %.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver2's new balance: %.2f\n", saver2.getSavingsBalance());
    }
}
