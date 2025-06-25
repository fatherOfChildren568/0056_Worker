package services;

import java.util.ArrayList;
import java.util.List;

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

    public void upSalary(int id, double upSalary) {
        for (Worker worker : listWorkers) {
            if (worker.getId() == id) {
                worker.setSalary(worker.getSalary() + upSalary);
                Salary salary = new Salary(worker.getSalary(), constants.SalaryStatus.UP, GetLocalDate.getDate());
                worker.getSalaryHistory().add(salary);
            }
        }
    }

}
