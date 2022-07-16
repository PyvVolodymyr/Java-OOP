package com.company;

public class triad {
    protected int x;
    protected int y;
    protected int z;

    // Constructors
    public triad() {
        this.x = this.y = this.z = 0;
        System.out.println("Triad constructor: default");
    }
    public triad(int x, int y, int z) {
        this.x = Math.max(x, 0);
        this.y = Math.max(y, 0);
        this.z = Math.max(z, 0);
        System.out.println("Triad constructor: with parameters");
    }

    // Getters and setters
    public int get_x() { return this.x; }
    public int get_y() { return this.y; }
    public int get_z() { return this.z; }

    public void set_x(int x) {
        this.x = x;
    }
    public void set_y(int y) {
        this.y = y;
    }
    public void set_z(int z) { this.z = z; }

    // Tasks
    public void all_up() {
        this.x++;
        this.y++;
        this.z++;
    }
    public void all_down() {
        if (this.x == 0 || this.y == 0 || this.z == 0) {
            this.x--;
            this.y--;
            this.z--;
        }
        else System.out.println("Can`t do this operation: distance or time can`t be less than 0");
    }
    public void GetInfo() {
        System.out.println("X = " + this.x + " Y = " + this.y + " Z = " + this.z);
    }
}