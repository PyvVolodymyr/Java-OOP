package interfaces;

public interface Shiftable extends Movable {
    int step_shift = 1;

    void shiftForward();
    void shiftBackward();
}
