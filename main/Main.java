package main;

import java.util.Scanner;
import utility.Validator;
import constants.Message;
import controller.WorkerController;
import dto.DTO;

class Main {
    private static Scanner sc = new Scanner(System.in);
    private static DTO dto = new DTO();

    public static void main(String[] args) {
        // declear
        WorkerController workerController = new WorkerController();

        // loop until exit
        while (true) {
            try {
                // display menu
                menu();
                // input choice function
                int choice = Integer.parseInt(sc.nextLine());
                // check choice limit in range
                if (!Validator.isLimitInRange(choice, 1, 5)) {
                    System.out.println(Message.ERROR_LIMIT_CHOICE_FUNCTION);
                    continue;
                }

                switch (choice) {
                    // add worker
                    case 1:
                        // input id
                        System.out.print(Message.PROMPT_ID);
                        int id = Integer.parseInt(sc.nextLine());
                        // check valid id
                        if (!Validator.isValidId(id)) {
                            System.out.println(Message.ERROR_INVALID_ID);
                            continue;
                        }
                        //check exist id in list workers
                        if(workerController.isExist(id)){
                            System.out.println(Message.ERROR_EXIST_ID);
                            continue;
                        }
                        // inpt name
                        System.out.print(Message.PROMPT_NAME);
                        String name = sc.nextLine();
                        // check valid name
                        if (!Validator.isValidString(name)) {
                            System.out.println(Message.ERROR_INVALID_NAME);
                            continue;
                        }

                        // input age
                        System.out.print(Message.PROMPT_AGE);
                        int age = Integer.parseInt(sc.nextLine());
                        // check valid age
                        if (!Validator.isValidAge(age)) {
                            System.out.println(Message.ERROR_INVALID_AGE);
                            continue;
                        }

                        // input salary
                        System.out.print(Message.PROMPT_SALARY);
                        double salary = Double.parseDouble(sc.nextLine());
                        // check valid double
                        if (!Validator.isValiDoulbe(salary)) {
                            System.out.println(Message.ERROR_INVALID_SALARY);
                            continue;
                        }

                        // input work location
                        System.out.print(Message.PROMPT_WORK_LOCATION);
                        String workLocation = sc.nextLine();
                        // check valid double
                        if (!Validator.isValidString(workLocation)) {
                            System.out.println(Message.ERROR_INVALID_WORK_LOCATION);
                            continue;
                        }
                        // setDataForDto
                        setDataForDto(id, name, age, salary, workLocation);
                        // set data for controller
                        workerController.setInput(dto);
                        // add worker
                        workerController.addWorker();
                        break;
                    // up salary
                    case 2:
                        // input id
                        System.out.print(Message.PROMPT_ID);
                        int uId = Integer.parseInt(sc.nextLine());
                        if (!Validator.isValidId(uId)) {
                            System.out.println(Message.ERROR_INVALID_ID);
                            continue;
                        }
                        // input up salary
                        System.out.print(Message.PROMPT_ADJUST_SALARY);
                        double upSalary = Double.parseDouble(sc.nextLine());
                        if (!Validator.isValiDoulbe(upSalary)) {
                            System.out.println(Message.ERROR_INVALID_SALARY);
                            continue;
                        }
                        // set data for dto
                        dto.setId(uId);
                        dto.setAdjustedSalary(upSalary);
                        // set data for controller
                        workerController.setInput(dto);
                        // up salary
                        workerController.upSalary();
                        break;
                    // down salary
                    case 3:
                        // input id
                        System.out.print(Message.PROMPT_ID);
                        int dId = Integer.parseInt(sc.nextLine());
                        if (!Validator.isValidId(dId)) {
                            System.out.println(Message.ERROR_INVALID_ID);
                            continue;
                        }
                        // input up salary
                        System.out.print(Message.PROMPT_ADJUST_SALARY);
                        double downSalary = Double.parseDouble(sc.nextLine());
                        if (!Validator.isValiDoulbe(downSalary)) {
                            System.out.println(Message.ERROR_INVALID_SALARY);
                            continue;
                        }
                        // set data for dto
                        setDataForDto(dId, null, 0, downSalary, null);
                        // set data for controller
                        workerController.setInput(dto);
                        // up salary
                        workerController.downSalary();
                        break;
                    // display information salary
                    case 4:
                        workerController.displayListSalaryOfWorkers();
                        break;
                    // exit
                    case 5:
                        System.exit(0);
                        sc.close();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }

        }
    }

    // setDataForDto
    private static void setDataForDto(int id, String name, int age, double salary, String workLocation) {
        dto.setId(id);
        dto.setName(name);
        dto.setAge(age);
        dto.setSalary(salary);
        dto.setWorkLocation(workLocation);
    }

    // menu
    private static void menu() {
        System.out.println("======== Worker Management =========");
        System.out.println("1.Add Worker");
        System.out.println("2.Up salary");
        System.out.println("3.Down salary");
        System.out.println("4.Display Information salary");
        System.out.println("5.Exit");
        System.out.print("Choice: ");
    }
}