package controller;

import java.util.ArrayList;
import java.util.List;
import constants.Message;
import model.*;
import services.WorkerService;
import view.WorkerView;
import dto.DTO;

public class WorkerController {
    // declear
    private DTO input = new DTO();
    private List<Worker> listWorkers = new ArrayList<>();
    private WorkerService workerService = new WorkerService();
    private WorkerView workerView = new WorkerView();

    // set data for controller
    public void setInput(DTO input) {
        this.input = input;
    }

    // add new worker in list
    public void addWorker() {
        // get input
        int id = input.getId();
        String name = input.getName();
        int age = input.getAge();
        Double salary = input.getSalary();
        String workLocation = input.getWorkLocation();
        // add
        listWorkers.add(new Worker(id, name, age, salary, workLocation));
    }

    // up salary
    public void upSalary() {
        // get input
        int id = input.getId();
        double upSalary = input.getAdjustedSalary();
        // transfer list into service
        workerService.setListWorkers(listWorkers);
        // up salary
        workerService.upSalary(id, upSalary);
    }

    public void downSalary() {
        // get input
        int id = input.getId();
        double downSalary = input.getSalary();
        // transfer list into service
        workerService.setListWorkers(listWorkers);
        // down salary
        workerService.downSalary(id, downSalary);
    }

    // displayListSalaryOfWorkers
    public void displayListSalaryOfWorkers() {
        String header = Message.HEADER_LIST;
        // set header
        workerView.setHeader(header);
        // create string to store data
        StringBuilder sb = new StringBuilder();
        for (Worker worker : listWorkers) {
            sb.append(worker);
        }
        // set body
        workerView.setBody(sb.toString());
        // display
        workerView.display();
    }

    //check id is exist in list workers
    public boolean isExist(int id) {
        for (Worker worker : listWorkers) {
            if(worker.getId() == id){
                return true;
            }
        }
        return false;
    }

}
