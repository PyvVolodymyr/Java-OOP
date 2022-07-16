package oop_lr_7;
import interfaces.Shiftable;
import java.util.Scanner;

public class ShiftRobot extends Robot implements Shiftable {
    private int start_shift;
    private int end_shift;

    public ShiftRobot() {
        super(0, 0, 0);
        this.start_shift = 0;
        this.end_shift = 2;
    }
    public ShiftRobot(int x, int y, int course, int end_shift) {
        super(x, y, course);
        while(start_shift >= end_shift) {
            Scanner in = new Scanner(System.in);
            System.out.println("start_shift must be lower than end_shift:");
            start_shift = in.nextInt();
            end_shift = in.nextInt();
        }
        this.start_shift = x;
        this.end_shift = end_shift;
    }

    public int get_start_shift() { return start_shift; }
    public int get_end_shift() { return end_shift; }
    public void set_start_shift(int a) { start_shift = a; }
    public void set_end_shift(int a) { end_shift = a; }

    public void shiftForward() {
        while (get_x() != end_shift) {
            set_x(get_x() + step_shift);
            talk();
        }
    }
    public void shiftBackward() {
        while (get_x() != start_shift) {
            set_x(get_x() - step_shift);
            talk();
        }
    }
    public void move() {
        shiftForward();
        shiftBackward();
    }
    public void talk() {
        System.out.println("Hello, I`m at (" + get_x() + "; " + get_y() + ") and looking at " + get_course());
    }
}
