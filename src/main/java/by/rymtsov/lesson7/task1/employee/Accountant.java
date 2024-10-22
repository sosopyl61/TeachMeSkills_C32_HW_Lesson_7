package main.java.by.rymtsov.lesson7.task1.employee;

import main.java.by.rymtsov.lesson7.task1.post.OutputPost;

/**
 * This class describes an accountant.
 */

public class Accountant implements OutputPost {

    String name;
    int age;
    int workExperience;
    int salaryUSD;
    String languageKnowledge;

    public Accountant(String name, int age, int workExperience, int salaryUSD, String languageKnowledge) {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
        this.salaryUSD = salaryUSD;
        this.languageKnowledge = languageKnowledge;
    }

    @Override
    public String outputPost() {
        return "Accountant";
    }

    @Override
    public String toString() {
        return "Post: " + outputPost() + '\n' +
                "Name: " + name + '\n' +
                "Age: " + age + '\n' +
                "Work experience: " + workExperience + '\n' +
                "Salary in USD: " + salaryUSD + '\n' +
                "Language knowledge: " + languageKnowledge + '\n';
    }
}
