package oop_lr_7;

public class Main {

    public static void main(String[] args) {
        WalkRobot robot = new WalkRobot(1, 2, 90);
        robot.set_actionList();
        robot.view_actionList();
        robot.move();
    }
}