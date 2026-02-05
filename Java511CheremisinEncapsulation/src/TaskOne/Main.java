package TaskOne;

public class Main {
    public void main(String[] args) {
        ChildBankAccount account = new ChildBankAccount(10000.0);

        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balans: " + account.getBalans());

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balans: " + account.getBalans());
    }
}
