package com.company;

public class Main {

    public static void main(String[] args) {
        dist d = new dist(2, -4, 9);
        time t = new time(0, 34, 59);
        d.GetInfo();
        t.all_up();
        t.GetInfo();
        triad[] mas = new triad[5];
        for (int i = 0; i < 5; i++){
            if(i % 2 == 0) mas[i] = new time(2, 2, 70);
            else mas[i] = new dist(2, 2, 70);
        }
        for (int i = 0; i < 5; i++) {
            mas[i].GetInfo();
        }
    }
}