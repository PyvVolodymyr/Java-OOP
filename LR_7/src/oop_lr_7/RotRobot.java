package oop_lr_7;
import interfaces.Rotatable;

public class RotRobot extends Robot implements Rotatable {
    private int start_angle;
    private int end_angle;

    public RotRobot() {
        super(0, 0, 0);
        this.start_angle = 0;
        this.end_angle = 180;
    }
    public RotRobot(int x, int y, int course, int end_angle) {
        super(x, y, course);
        this.start_angle = course;
        this.end_angle = end_angle;
    }

    public int get_start_angle() { return start_angle; }
    public int get_end_angle() { return end_angle; }
    public void set_start_angle(int a) { start_angle = a; }
    public void set_end_angle(int a) { end_angle = a; }

    public void rotateForward() {
        while (get_course() != end_angle) {
            set_course(get_course() + step_angle);
            if (get_course() == 360) set_course(0);
            talk();
        }
    }
    public void rotateBackward() {
        while (get_course() != start_angle) {
            set_course(get_course() - step_angle);
            if (get_course() == -90) set_course(270);
            talk();
        }
    }
    public void move() {
        rotateForward();
        rotateBackward();
    }
    public void talk() {
        System.out.println("Hello, I`m at (" + get_x() + "; " + get_y() + ") and looking at " + get_course());
    }
}
