package com.company;

public class time extends triad {
    public time() {
        System.out.println("Time constructor: default");
    }
    public time(int x, int y, int z) {
        super(x, y, z);
        while (this.z >= 60) {
            this.z -= 60;
            this.y++;
        }
        while (this.y >= 60) {
            this.y -= 60;
            this.x++;
        }
        System.out.println("Time constructor: with parameters");
    }

    // Tasks
    public void x_up() {
        this.x++;
    }
    public void y_up() {
        this.y++;
        if (this.y == 60) {
            this.x++;
            this.y = 0;
        }
    }
    public void z_up() {
        this.z++;
        if (this.z == 60) {
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
        if (this.x == 0) System.out.println("Can`t do this operation: time can`t be less than 0");
        else this.x--;
    }
    public void y_down() {
        if (this.y == 0) {
            if (this.x == 0) System.out.println("Can`t do this operation: time can`t be less than 0");
            else {
                this.x--;
                this.y = 59;
            }
        }
        else this.y--;
    }
    public void z_down() {
        if (this.z == 0) {
            if (this.x == 0 && this.y == 0) System.out.println("Can`t do this operation: time can`t be less than 0");
            else {
                y_down();
                this.z = 59;
            }
        }
        else this.z--;
    }
    public void all_down() {
        if (this.x * 3600 + this.y * 60 + this.z >= 3661) {
            x_down();
            y_down();
            z_down();
        }
        else System.out.println("Can`t do this operation: time can`t be less than 0");
    }
}