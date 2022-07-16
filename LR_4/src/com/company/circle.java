package com.company;

public class circle {
    private float R;

    // Constructors
    public circle() {
        this.R = 1f;
        System.out.println("Circle constructor: default");
    }
    public circle(float x) {
        this.R = x;
        System.out.println("Circle constructor: with parameters");
    }

    // Getter and setter
    public float get_R() {return this.R;}
    public void set_R(float x) {this.R = x;}

    public void view() {
        System.out.println("R = " + this.R);
    }
}