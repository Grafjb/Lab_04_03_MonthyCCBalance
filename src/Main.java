//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 5000.0;
        double interestRate = 0.17;


        double interestOneMonth = creditCardBalance * (interestRate / 12);

        double interestTwoMonths = (creditCardBalance + interestOneMonth) * (interestRate / 12);

        System.out.println("Credit card balance: $" + creditCardBalance);
        System.out.println("Interest due after one month: $" + interestOneMonth);
        System.out.println("Interest due after two months: $" + interestTwoMonths);
    }
}

