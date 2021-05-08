package lab9.Task1;

public class Payment implements BankingOperation {
    accountVal account;
    Double val;

    public Payment(accountVal account, Double val){
        this.account = account;
        this.val = val;
    }

    public void execute(){
        account.payment(val);
    }
}