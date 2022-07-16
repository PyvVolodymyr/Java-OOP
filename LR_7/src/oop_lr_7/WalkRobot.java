package oop_lr_7;
import interfaces.Shiftable;
import interfaces.Rotatable;
import java.util.Scanner;

public class WalkRobot extends Robot implements Shiftable, Rotatable {
    private Action.ActionType[] actionList = new Action.ActionType[5];
    public WalkRobot() {
        super(0, 0, 0);
        for(int i = 0; i < actionList.length; i++) actionList[i] = Action.ActionType.valueOf("talk");
    }
    public WalkRobot(int x, int y, int course) {
        super(x, y, course);
        for(int i = 0; i < actionList.length; i++) actionList[i] = Action.ActionType.valueOf("talk");
    }
    public void set_actionList() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter commands for robot:\n1 for RotF\n2 for RotB\n3 for ShiftF\n4 for ShiftB\n5 for talk");
        for(int i=0;i<actionList.length;i++){
            int command = in.nextInt();
            switch(command) {
                case 1: actionList[i] = Action.ActionType.valueOf("RotF"); break;
                case 2: actionList[i] = Action.ActionType.valueOf("RotB"); break;
                case 3: actionList[i] = Action.ActionType.valueOf("ShiftF"); break;
                case 4: actionList[i] = Action.ActionType.valueOf("ShiftB"); break;
                case 5: actionList[i] = Action.ActionType.valueOf("talk"); break;
            }
        }
    }
    public void view_actionList() {
        System.out.println("Current commands for robot:");
        for(int i = 0; i < actionList.length; i++){
            System.out.println(actionList[i]);
        }
    }
    public void rotateForward() {
        set_course(get_course() + step_angle);
        if (get_course() == 360) set_course(0);
    }
    public void rotateBackward() {
        set_course(get_course() - step_angle);
        if (get_course() == -90) set_course(270);
    }
    public void shiftForward() {
        switch(get_course()) {
            case 0: set_x(get_x() + step_shift); break;
            case 90: set_y(get_y() + step_shift); break;
            case 180: set_x(get_x() - step_shift); break;
            case 270: set_y(get_y() - step_shift); break;
            default: System.out.println("Something go wrong!!!");
        }
    }
    public void shiftBackward() {
        switch(get_course()) {
            case 0: set_x(get_x() - step_shift); break;
            case 90: set_y(get_y() - step_shift); break;
            case 180: set_x(get_x() + step_shift); break;
            case 270: set_y(get_y() + step_shift); break;
            default: System.out.println("Something go wrong!!!");
        }
    }
    public void talk() {
        System.out.println("Hello, I`m at (" + get_x() + "; " + get_y() + ") and looking at " + get_course());
    }
    public void move() {
        System.out.println("Robot start moving:");
        for(int i = 0; i < actionList.length; i++) {
            switch(actionList[i]) {
                case RotF: rotateForward(); break;
                case RotB: rotateBackward(); break;
                case ShiftF: shiftForward(); break;
                case ShiftB: shiftBackward(); break;
                case talk: talk(); break;
                default: System.out.println("Something go wrong!!!");
            }
        }
    }
}