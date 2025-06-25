package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;
import services.WorkerService;
import dto.DTO;

public class WorkerController {
    // declear
    private DTO input = new DTO();
    private List<Worker> listWorkers = new ArrayList<>();
    private WorkerService workerService = new WorkerService();

    // set data for controller
    public void setInput(DTO input) {
        this.input = input;
    }

    //add new worker in list
    public void addWorker() {
        // get input
        int id = input.getId();
        String name = input.getName();
        int age = input.getAge();
        Double salary = input.getSalary();
        String workLocation = input.getWorkLocation();
        //add 
        listWorkers.add(new Worker(id, name, age, salary, workLocation));
    }


    public void displayListWorkers(){
        for (Worker worker : listWorkers) {
            System.out.println(worker);
        }
    }

    //up salary
    public void upSalary() {
        //get input
        int id = input.getId();
        double upSalary = input.getSalary();
        //transfer list into service
        workerService.setListWorkers(listWorkers);
        //up salary
        workerService.upSalary(id, upSalary);
    }

}
