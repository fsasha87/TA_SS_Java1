package hw_java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actions {
    List<String> cars = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Menu option;

    public void add() {
        System.out.println("Please enter any brand of car");
        cars.add(sc.nextLine());
    }

    public void remove() {
        System.out.println("Please enter the brand of the car that should be removed");
        cars.remove(sc.nextLine());
    }

    public void show() {
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public void sort() {
        cars.sort(String::compareTo);
        for (String car : cars) {
            System.out.println(cars);
        }
    }

    public void exit() {
        System.exit(0);
    }

    public void console() {
        while (option != Menu.EXIT) {

            System.out.println("Please enter operation");
            Menu[] menuOptions = Menu.values();
            for (Menu s : menuOptions) {
                System.out.print(s + "\t");
            }
            System.out.println();
            option = Menu.valueOf(sc.nextLine().toUpperCase());
            switch (option) {
                case ADD:
                    add();
                    break;
                case REMOVE:
                    remove();
                    break;
                case SHOW:
                    show();
                    break;
                case SORT:
                    sort();
                    break;
                case EXIT:
                    exit();
                default:
                    System.out.println("Such operation doesn't exist");
                    exit();
            }
        }
    }

}
