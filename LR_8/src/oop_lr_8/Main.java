package oop_lr_8;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        ArrayList<bus> bus_list = new ArrayList<bus>();

        try {
            File file = new File("ListIn.txt");
            FileReader r = new FileReader(file);
            BufferedReader reader = new BufferedReader(r);
            String line = reader.readLine();
            int counter = 0;
            int i = 0;
            while (line != null) {
                if (counter == 0) bus_list.add(new bus());
                if (counter == 0) bus_list.get(i).set_name0(line);
                else if (counter == 1) bus_list.get(i).set_name1(line);
                else if (counter == 2) bus_list.get(i).set_name2(line);
                else if (counter == 3) bus_list.get(i).set_route(parseInt(line));
                else if (counter == 4) bus_list.get(i).set_m_brand(line);
                else if (counter == 5) bus_list.get(i).set_year(parseInt(line));
                else if (counter == 6) {
                    bus_list.get(i).set_mileage(parseInt(line));
                    counter = -1;
                }
                counter++;
                if(counter == 0) i++;
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("List.dat")))
        {
            oos.writeObject(bus_list);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        Scanner in = new Scanner(System.in);
        int task = -1;
        while (task != 0) {
            System.out.println("Input number of task(0 to end):\n1 - Find route\n2 - Find bus by brand which older than 10 years\n3 - Find Mileage higher than 10.000");
            task = in.nextInt();
            if (task == 1) {
                int ToFind;
                System.out.println("Input route to find:");
                ToFind = in.nextInt();
                for (int i = 0; i < bus_list.size(); i++) {
                    bus_list.get(i).SearchRoute(ToFind);
                }
            }
            else if (task == 2) {
                String ToFindBrand;
                System.out.println("Input brand to find:");
                ToFindBrand = in.next();
                for (int i = 0; i < bus_list.size(); i++) {
                    bus_list.get(i).SearchBrand(ToFindBrand);
                }
            }
            else if (task == 3) {
                for (int i = 0; i < bus_list.size(); i++) {
                    bus_list.get(i).SearchMileage();
                }
            }
            else if(task == 0) continue;
            else System.out.println("You enter wrong number!!!");
        }

        bus temp = new bus();
        bus_list.add(temp);
        ArrayList<bus> new_list = new ArrayList<bus>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("List.dat")))
        {
            new_list = (ArrayList<bus>) ois.readObject();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        for (int i = 0; i < new_list.size(); i++) new_list.get(i).view();
    }
}