package interfaces;

public interface Rotatable extends Movable {
    int step_angle = 90;

    void rotateForward();
    void rotateBackward();
}
