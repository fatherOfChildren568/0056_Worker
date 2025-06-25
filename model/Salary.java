package model;

import constants.SalaryStatus;

public class Salary {
    // declear
    private double salaryCurrent;
    private SalaryStatus salaryStatus;
    private String date;

    // constructor no parameter
    public Salary() {
    }

    // constructor hava parameter
    public Salary(double salaryCurrent, SalaryStatus salaryStatus, String date) {
        this.salaryCurrent = salaryCurrent;
        this.salaryStatus = salaryStatus;
        this.date = date;
    }

    // getter and setter
    public double getSalaryCurrent() {
        return salaryCurrent;
    }

    public void setSalaryCurrent(double salaryCurrent) {
        this.salaryCurrent = salaryCurrent;
    }

    public SalaryStatus getSalaryStatus() {
        return salaryStatus;
    }

    public void setSalaryStatus(SalaryStatus salaryStatus) {
        this.salaryStatus = salaryStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-15s", salaryCurrent, salaryStatus, date);
    }

}
