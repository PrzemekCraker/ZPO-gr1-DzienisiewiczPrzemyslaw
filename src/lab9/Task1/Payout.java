package lab9.Task1;

public class Payout implements BankingOperation {
    accountVal account;
    Double val;

    public Payout(accountVal account, Double val){
        this.account = account;
        this.val = val;
    }

    public void execute(){
        konto.payout(val);
    }
}
