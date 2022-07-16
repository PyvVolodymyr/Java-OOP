package oop_lr_7;

public class Robot {
    private int x;
    private int y;
    private int course;

    public Robot() {
        x = 0;
        y = 0;
        course = 0;
    }
    public Robot(int x, int y, int course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }
    public int get_x() { return this.x; }
    public int get_y() { return this.y; }
    public int get_course() { return this.course; }
    public void set_x(int a) { this.x = a; }
    public void set_y(int a) { this.y = a; }
    public void set_course(int a) { this.course = a; }

    public void talk() {
        System.out.println("Hello, I`m at (" + x + " " + y + ") and looking at " + course);
    }
}