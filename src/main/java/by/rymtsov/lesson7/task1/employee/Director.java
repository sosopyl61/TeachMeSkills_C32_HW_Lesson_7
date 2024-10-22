package main.java.by.rymtsov.lesson7.task1.employee;

import main.java.by.rymtsov.lesson7.task1.post.OutputPost;

/**
 * This class describes a director.
 */

public class Director implements OutputPost {

    String name;
    int age;
    int workExperience;
    int salaryUSD;
    int cabinetNumber;

    public Director(String name, int age, int workExperience, int salaryUSD, int cabinetNumber) {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
        this.salaryUSD = salaryUSD;
        this.cabinetNumber = cabinetNumber;
    }

    @Override
    public String outputPost() {
        return "Director";
    }

    @Override
    public String toString() {
        return "Post: " + outputPost() + '\n' +
                "Name: " + name + '\n' +
                "Age: " + age + '\n' +
                "Work experience: " + workExperience + '\n' +
                "Salary in USD: " + salaryUSD + '\n' +
                "Cabinet number: " + cabinetNumber + '\n';
    }
}
