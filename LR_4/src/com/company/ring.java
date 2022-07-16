package com.company;

public class ring extends circle{
    private float radius;

    // Constructors
    public ring() {
        this.radius = 0.5f;
        System.out.println("Ring constructor: default");
    }
    public ring(float x, float y) {
        super(x);
        this.radius = y;
        System.out.println("Ring constructor: with parameters(2 float)");
    }
    public ring(circle a, float x) {
        super(a.get_R());
        this.radius = x;
        System.out.println("Ring constructor: with parameters(circle and float)");
    }

    // Getters and setters
    public float get_radius() {return this.radius;}
    public void set_radius(float x) {this.radius = x;}

    // Tasks
    public void view() {
        super.view();
        System.out.println("radius = " + this.radius);
    }
    public float internal_rad() {
        float temp = Math.min(this.radius, get_R());
        return (float) (2 * Math.PI * temp);
    }
    public float external_rad() {
        float temp = Math.max(this.radius, get_R());
        return (float) (2 * Math.PI * temp);
    }
    public float square() {
        float temp = Math.max(this.radius, get_R()) *  Math.max(this.radius, get_R()) - Math.min(this.radius, get_R()) * Math.min(this.radius, get_R());
        return (float) Math.PI * temp;
    }
}
