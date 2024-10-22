package main.java.by.rymtsov.lesson7.task2;

import main.java.by.rymtsov.lesson7.task2.figure.Circle;
import main.java.by.rymtsov.lesson7.task2.figure.Figure;
import main.java.by.rymtsov.lesson7.task2.figure.Rectangle;
import main.java.by.rymtsov.lesson7.task2.figure.Triangle;

/**
 * This is the main class for figures.
 * In this class, we input the figures.
 * Then, we output the information about them.
 * And in the end we get the sum of all perimeters.
 */

public class FigureMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(4, 6);
        figures[2] = new Circle(5);
        figures[3] = new Triangle(4, 4, 4);
        figures[4] = new Rectangle(5, 10);

        for (Figure figure : figures) {
            System.out.println(figure);
        }

        double sumPerimeters = 0;
        for (Figure figure : figures) {
            sumPerimeters += figure.getPerimeter();
        }

        System.out.println("The sum of all perimeters: " + sumPerimeters);
    }
}
