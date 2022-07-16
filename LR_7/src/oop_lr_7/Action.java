package oop_lr_7;

public class Action {
    private ActionType action;
    private int steps_count;

    public ActionType get_action() { return this.action; }
    public int get_steps_count() { return this.steps_count; }
    public void set_action(ActionType action) { this.action = action; }
    public void set_steps_count(int steps_count) { this.steps_count = steps_count; }

    public static enum ActionType { RotF, RotB, ShiftF, ShiftB, talk }
}