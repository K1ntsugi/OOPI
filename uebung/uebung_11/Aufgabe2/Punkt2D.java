package Aufgabe2;


import java.util.Random;

public class Punkt2D {
    //Attribute
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Konstruktoren
    public Punkt2D() {
        x = (int) (Math.random() * 100);
        y = (int) (Math.random() * 100);


    }

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Punkt2D p) {
        Punkt2D random = new Punkt2D();
        double param_X = p.getX();
        double param_Y = p.getY();
        double random_X = random.getX();
        double random_Y = random.getY();
        return Math.sqrt(Math.pow(param_X - random_X, 2) + Math.pow(param_Y - random_Y, 2));
    }

    public String toString() {
        return "Punkt x = " + x + " y = " + y;
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public Punkt2D mirrorPoint() {
        Punkt2D mirrorPkt = new Punkt2D(-x, -y);
        return mirrorPkt;
    }
}
