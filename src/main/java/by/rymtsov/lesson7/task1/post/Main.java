package main.java.by.rymtsov.lesson7.task1.post;

import main.java.by.rymtsov.lesson7.task1.employee.Accountant;
import main.java.by.rymtsov.lesson7.task1.employee.Director;
import main.java.by.rymtsov.lesson7.task1.employee.Worker;

import java.util.Scanner;

/**
 * This is the main class for employees.
 * In this class, you can choose one employee and
 * get information about him/her.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Director" + '\n' + "2 - Worker" + '\n' + "3 - Accountant");
        System.out.println("Please, enter the the job number: ");
        int jobNumber = scanner.nextInt();
        switch (jobNumber) {
            case 1:
                Director director = new Director("Bob Marley", 40, 10, 5000, 123);
                System.out.println(director);
                break;
            case 2:
                Worker worker = new Worker("Bob Ross", 30, 5, 1000, "painting");
                System.out.println(worker);
                break;
            case 3:
                Accountant accountant = new Accountant("Emma Stone", 28, 4, 2500, "English, French, Russian");
                System.out.println(accountant);
                break;
            default:
                System.out.println("Invalid job number!");
        }

    }
}
