package lab9.Task1;

public class Main {
    Account account = new Account(10000);

    account.doOperation(new payment(account,2500));
    account.doOperation(new payout(account,4500));
}
