package it.develhope.exercise;

public class Worker extends Employee {

    private int weeklyWorkingHours;

    public int getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    public void setWeeklyWorkingHours(int weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    @Override
    public boolean canApplyForPromotion() {
        if (this.weeklyWorkingHours > 35 && this.getEfficiencyIndex()>0.65){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean mayBeDemoted() {
        return false;
    }

    public Worker(int id, String name, float efficiencyIndex, int weeklyWorkingHours) {
        super(id, name, efficiencyIndex);
        this.weeklyWorkingHours = weeklyWorkingHours;
    }
}
