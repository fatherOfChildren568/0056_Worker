package model;

import java.util.ArrayList;
import java.util.List;

import utility.GetLocalDate;

public class Worker {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private double adjustSalary;
    private List<Salary> salaryHistory;

    // constructor no parameter
    public Worker() {
    }

    // constructor have parameter
    public Worker(int id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        salaryHistory = new ArrayList<>();
        this.salaryHistory.add(new Salary(salary, constants.SalaryStatus.DEFAULT, GetLocalDate.getDate()));
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

    public double getAdjustSalary() {
        return adjustSalary;
    }

    public void setAdjustSalary(double adjustSalary) {
        this.adjustSalary = adjustSalary;
    }

    public List<Salary> getSalaryHistory() {
        return salaryHistory;
    }

    public void setSalaryHistory(List<Salary> salaryHistory) {
        this.salaryHistory = salaryHistory;
    }

    @Override
    public String toString() {
        System.out.format("%-10s%-10s%-10s%-10s%-10s%-15s\n", "Id", "Name", "Age", "Salary", "Status", "Date");
        StringBuilder result = new StringBuilder();
        for (Salary salaryHistory : salaryHistory) {
            result.append(String.format("%-10s%-10s%-10s%-10s", id, name, age, salary)).append(salaryHistory.toString()).append("\n");
        }
        return result.toString();
    }

    
}