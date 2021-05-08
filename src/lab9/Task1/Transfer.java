package lab9.Task1;

public class Transfer implements BankingOperation {
    accountVal account;
    Double val;

    public Transfer(account payment, account payout, Double val){
        this.payment = payment;
        this.payout = payout;
        this.val = val;
    }

    public void execute(){
        payment.payment(val);
        payout.payout(val);
    }
}