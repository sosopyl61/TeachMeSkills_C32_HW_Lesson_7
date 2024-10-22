package main.java.by.rymtsov.lesson7.task1.employee;

import main.java.by.rymtsov.lesson7.task1.post.OutputPost;

/**
 * This class describes a worker.
 */

public class Worker implements OutputPost {

    String name;
    int age;
    int workExperience;
    int salaryUSD;
    String sphere;

    public Worker(String name, int age, int workExperience, int salaryUSD, String sphere) {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
        this.salaryUSD = salaryUSD;
        this.sphere = sphere;
    }

    @Override
    public String outputPost() {
        return "Worker";
    }

    @Override
    public String toString() {
        return "Post: " + outputPost() + '\n' +
                "Name: " + name + '\n' +
                "Age: " + age + '\n' +
                "Work experience: " + workExperience + '\n' +
                "Salary in USD: " + salaryUSD + '\n' +
                "Sphere: " + sphere + '\n';
    }
}
