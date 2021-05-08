package lab9.Task1;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private List<BankingOperation> trans = new ArrayList<BankingOperation>();
    private double accountVal = 0;

    public void payment(Double val){
        this.accountVal += val;
    }

    public void payout(Double val){
        this.accountVal += val;
    }
}
