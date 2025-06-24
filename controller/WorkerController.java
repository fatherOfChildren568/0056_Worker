package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;
import dto.DTO;

public class WorkerController {
    // declear
    private DTO input = new DTO();
    private List<Worker> listWorkers = new ArrayList<>();

    // set data for controller
    public void setInput(DTO input) {
        this.input = input;
    }

    public void addWorker() {
        int id = input.getId();
        String name = input.getName();
        int age = input.getAge();
        Double salary = input.getSalary();
        String workLocation = input.getWorkLocation();

        listWorkers.add(new Worker(id, name, age, salary, workLocation));
    }


    public void displayListWorkers(){
        for (Worker worker : listWorkers) {
            System.out.println(worker);
        }
    }

}
