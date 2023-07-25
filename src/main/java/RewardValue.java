public class RewardValue {
    long cash=0;
    double miles=0;
    RewardValue(long cash){
        this.cash = cash;
    }
    RewardValue(double miles){
        this.miles = miles;
    }
    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        return (miles / 0.0035);
    }

}
