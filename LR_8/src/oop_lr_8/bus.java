package oop_lr_8;
import java.io.Serializable;

public class bus implements Serializable {
    protected String name[] = new String[3];
    protected int route;
    protected Brand m_brand = Brand.unknown;
    protected int year;
    protected int mileage;

    public static enum Brand { Mercedes, Volvo, MAN, Setra, Etalon, unknown }
    public Brand from_str(String s) {
        if (s.equals("Mercedes")) return Brand.Mercedes;
        else if (s.equals("Volvo")) return Brand.Volvo;
        else if (s.equals("MAN")) return Brand.MAN;
        else if (s.equals("Setra")) return Brand.Setra;
        else if (s.equals("Etalon")) return Brand.Etalon;
        else return Brand.unknown;
    }
    public String to_str(Brand b) {
        if (b == Brand.Mercedes) return "Mercedes";
        else if (b == Brand.Volvo) return "Volvo";
        else if (b == Brand.MAN) return "MAN";
        else if (b == Brand.Setra) return "Setra";
        else if (b == Brand.Etalon) return "Etalon";
        else return "unknown";
    }

    public bus() {
        name[0] = name[1] = name[2] = "...default...";
        route = 0;
        year = 0;
        mileage = 0;
    }
    public bus(String name0, String name1, String name2, int route, String m_brand, int year, int mileage) {
        this.name[0] = name0;
        this.name[1] = name1;
        this.name[2] = name2;
        this.route = route;
        this.m_brand = from_str(m_brand);
        this.year = year;
        this.mileage = mileage;
    }
    String get_name0() { return this.name[0]; }
    String get_name1() { return this.name[1]; }
    String get_name2() { return this.name[2]; }
    int get_route() { return this.route; }
    Brand get_m_brand() { return this.m_brand; }
    int get_year() { return this.year; }
    int get_mileage() { return this.mileage; }
    void set_name0(String name0) { this.name[0] = name0; }
    void set_name1(String name1) { this.name[1] = name1; }
    void set_name2(String name2) { this.name[2] = name2; }
    void set_route(int route) { this.route = route; }
    void set_m_brand(String b) { this.m_brand = from_str(b); }
    void set_year(int year) { this.year = year; }
    void set_mileage(int mileage) { this.mileage = mileage; }

    public void view() {
        System.out.println("Name: " + name[0] + " " + name[1] + " " + name[2] + "\nRoute: " + route + "\nBus: " + m_brand + "(" + year + ") with mileage: " + mileage + "\n");
    }

    // Tasks
    public void SearchRoute(int route) {
        if (this.route == route) this.view();
    }
    public void SearchBrand(String b) {
        if (to_str(this.m_brand).equals(b)) this.view();
    }
    public void SearchMileage() {
        if (this.mileage > 10000) this.view();
    }
}
