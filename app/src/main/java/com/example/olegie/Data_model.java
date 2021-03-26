package com.example.olegie;

public class Data_model {
    private String stateName;
    private double labourForce;
    private double totalEmployed;
    private double totalUnemployed;

    public Data_model() {
    }

    public Data_model(String stateName, double labourForce, double totalEmployed, double totalUnemployed) {
        this.stateName = stateName;
        this.labourForce = labourForce;
        this.totalEmployed = totalEmployed;
        this.totalUnemployed = totalUnemployed;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getLabourForce() {
        return labourForce;
    }

    public void setLabourForce(double labourForce) {
        this.labourForce = labourForce;
    }

    public double getTotalEmployed() {
        return totalEmployed;
    }

    public void setTotalEmployed(double totalEmployed) {
        this.totalEmployed = totalEmployed;
    }

    public double getTotalUnemployed() {
        return totalUnemployed;
    }

    public void setTotalUnemployed(double totalUnemployed) {
        this.totalUnemployed = totalUnemployed;
    }
}
