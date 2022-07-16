package com.company;

public class dist extends triad {
    public dist() {
        System.out.println("Dist constructor: default");
    }
    public dist(int x, int y, int z) {
        super(x, y, z);
        while (this.z >= 10) {
            this.z -= 10;
            this.y++;
        }
        while (this.y >= 100) {
            this.y -= 100;
            this.x++;
        }
        System.out.println("Dist constructor: with parameters");
    }

    // Tasks
    public void x_up() {
        this.x++;
    }
    public void y_up() {
        this.y++;
        if (this.y == 100) {
            this.x++;
            this.y = 0;
        }
    }
    public void z_up() {
        this.z++;
        if (this.z == 10) {
            this.z = 0;
            y_up();
        }
    }
    public void all_up() {
        x_up();
        y_up();
        z_up();
    }
    public void x_down() {
        if (this.x == 0) System.out.println("Can`t do this operation: distance can`t be less than 0");
        else this.x--;
    }
    public void y_down() {
        if (this.y == 0) {
            if (this.x == 0) System.out.println("Can`t do this operation: distance can`t be less than 0");
            else {
                this.x--;
                this.y = 99;
            }
        }
        else this.y--;
    }
    public void z_down() {
        if (this.z == 0) {
            if (this.x == 0 && this.y == 0) System.out.println("Can`t do this operation: distance can`t be less than 0");
            else {
                y_down();
                this.z = 9;
            }
        }
        else this.z--;
    }
    public void all_down() {
        if (this.x * 1000 + this.y * 10 + this.z >= 1011) {
            x_down();
            y_down();
            z_down();
        }
        else System.out.println("Can`t do this operation: distance can`t be less than 0");
    }
}