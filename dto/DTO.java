package dto;

import model.Salary;

public class DTO {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private double adjustedMoney;
    private Salary salaryHistory;

    // constructor no parameter
    public DTO() {
    }

    // constructor have parameter
    public DTO(int id, String name, int age, double salary, String workLocation, double adjustedMoney,
            Salary salaryHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.adjustedMoney = adjustedMoney;
        this.salaryHistory = salaryHistory;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public double getAdjustedMoney() {
        return adjustedMoney;
    }

    public void setAdjustedMoney(double adjustedMoney) {
        this.adjustedMoney = adjustedMoney;
    }

    public Salary getSalaryHistory() {
        return salaryHistory;
    }

    public void setSalaryHistory(Salary salaryHistory) {
        this.salaryHistory = salaryHistory;
    }

}
