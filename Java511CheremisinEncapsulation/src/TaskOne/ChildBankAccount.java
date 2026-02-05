package TaskOne;

public class ChildBankAccount {
    private double balans;
    private final double maxBalans;

    ChildBankAccount(double maxBalans) {
      this.maxBalans = maxBalans;
      this.balans = 0.0;
    }

    public boolean depositMoney(double value) {
        if(value < 0){
            return false;
        }
        if(this.balans + value > maxBalans){
            return false;
        }
        this.balans +=value;
        return true;
    }

    public boolean debitMoney(double value) {
        if(value < 0){
            return false;
        }
        if(this.balans - value < 0){
            return false;
        }
        this.balans -=value;
        return true;
    }

    public double getBalans(){
        return this.balans;
    }
}
