package it.develhope.exercise;

public abstract class Employee {

     private int id;
     private String name;
     private float efficiencyIndex;

    public Employee(int id, String name, float efficiencyIndex) {
        this.id = id;
        this.name = name;
        this.efficiencyIndex = efficiencyIndex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getEfficiencyIndex() {
        return efficiencyIndex;
    }

    public abstract boolean canApplyForPromotion();
    public abstract boolean mayBeDemoted();

}
