package services;

import java.util.ArrayList;
import java.util.List;

import constants.SalaryStatus;
import model.Salary;
import model.Worker;
import utility.GetLocalDate;

public class WorkerService {
    // decleaer
    List<Worker> listWorkers = new ArrayList<>();

    // getter and setter
    public List<Worker> getListWorkers() {
        return listWorkers;
    }

    public void setListWorkers(List<Worker> listWorkers) {
        this.listWorkers = listWorkers;
    }

    // up salary
    public void upSalary(int id, double upSalary) {
        for (Worker worker : listWorkers) {
            if (worker.getId() == id) {
                // new salary
                double newSalary = worker.getSalary() + upSalary;
                worker.setSalary(newSalary);

                // Ghi nhận lịch sử tăng lương
                Salary salary = new Salary(newSalary, SalaryStatus.UP, GetLocalDate.getDate());
                worker.getSalaryHistory().add(salary);
            }
        }
    }

    // down salary
    public void downSalary(int id, double downSalary) {
        for (Worker worker : listWorkers) {
            if (worker.getId() == id) {
                // count new salary
                double newSalary = worker.getSalary() - downSalary;
                if (newSalary < 0) {
                    System.out.println("Error");
                }
                worker.setSalary(newSalary);
                Salary salary = new Salary(worker.getSalary(), SalaryStatus.DOWN, GetLocalDate.getDate());
                worker.getSalaryHistory().add(salary);
            }
        }
    }

}
