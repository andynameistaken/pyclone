package oop_concepts.e02_classes;
import helpers.OutToFile;

public class BicycleDemo
{
    public static void main(String[] args) {
        //  Create helper object for saving console output to file (for automation in my writing)
        OutToFile of = new OutToFile("classes_out");
        // Create two different
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}