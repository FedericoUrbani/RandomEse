package it.develhope.exercise;

public class Head extends Employee {

    private int yearsAsHead;

    public int getYearsAsHead() {
        return yearsAsHead;
    }

    public void setYearsAsHead(int yearsAsHead) {
        this.yearsAsHead = yearsAsHead;
    }

    public Head(int id, String name, float efficiencyIndex, int yearsAsHead) {
        super(id, name, efficiencyIndex);
        this.yearsAsHead = yearsAsHead;
    }

    @Override
    public boolean canApplyForPromotion() {
    return false;
    }

    @Override
    public boolean mayBeDemoted() {
        if (this.yearsAsHead < 10 && this.getEfficiencyIndex() < 0.5){
            return true;
        }else{
            return false;
        }
    }
}
