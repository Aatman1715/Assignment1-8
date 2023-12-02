//Author : Karamveer Singh C0893963

import java.util.ArrayList;
import java.util.List;

enum VehicleType {
    RACE,
    NOT_FOR_RACE,
    Family
}

enum Gear {
    Manual,
    Automatic
}

enum CarType {
    Sport,
    Sedan,
    Hatchback,
    SUV
}

abstract class Vehicle {
    String make;
    String plate;
    String color;
    VehicleType category;

    Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Plate: " + plate + ", Color: " + color + ", Category: " + category;
    }
}

class Motorcycle extends Vehicle {
    boolean sidecar;

    Motorcycle(String make, String plate, String color, VehicleType category, boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sidecar: " + sidecar;
    }
}

class Car extends Vehicle {
    Gear gear;
    CarType type;

    Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gear: " + gear + ", Type: " + type;
    }
}

public class Management {
    static double workingDaysPerMonth = 20.0;

    List<Employee> employees = new ArrayList<>();

    // Motorcycle and Car instances
    Motorcycle m1 = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", VehicleType.RACE, false);
    Motorcycle m2 = new Motorcycle("Honda", "Custom Plate", "Black", VehicleType.NOT_FOR_RACE, true);

    Car vt1 = new Car("Lamborghini", "Custom Plate", "White", VehicleType.Family, Gear.Manual, CarType.Sport);
    Car vt2 = new Car("BMW", "Custom Plate", "Black", VehicleType.Family, Gear.Automatic, CarType.Sedan);
    Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", VehicleType.Family, Gear.Manual, CarType.Hatchback);
    Car vt4 = new Car("Mazda", "Custom Plate", "White", VehicleType.Family, Gear.Automatic, CarType.SUV);

    void hireTest1() {
        employees.add(new Manager("Serge", 1985, 30, 4,50));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80));
        employees.add(new Programmer("Paul", 1993, 3, 75));
        employees.add(new Tester("Pierre", 1987, 124, 50));
        employees.add(new Programmer("Matt", 1981, 5, 110));
        employees.add(new Programmer("Sarah", 1986, 3,40));
        displayEmployeeDetails();
    }

    void hireTest2() {
        employees.clear();
        employees.add(new Manager("Serge", 1985, 30, 4, vt1));
        employees.add(new Manager("Cindy", 1974, 20, 6, vt2));
        employees.add(new Programmer("Paul", 1993, 3, 75, m1));
        employees.add(new Tester("Pierre", 1987, 124, 50, m2));
        employees.add(new Programmer("Matt", 1981, 5, 110, vt4));
        employees.add(new Programmer("Sarah", 1986, 3, vt3));
        displayEmployeeDetails();
    }

    void hireTest3() {
        employees.clear();
        Employee serge = new Manager("Serge", 1985, 30, 4, vt1);
        Employee cindy = new Manager("Cindy", 1974, 20, 6, vt2);
        Employee paul = new Programmer("Paul", 1993, 3, 75, m1);
        Employee pierre = new Tester("Pierre", 1987, 124, 50, m2);
        Employee matt = new Programmer("Matt", 1981, 5, 110, vt4);
        Employee sarah = new Programmer("Sarah", 1986, 3, vt3);

        Contract p1 = new Permanent(2, true, 6000, 200, 17);
        Contract p2 = new Permanent(3, false, 5000, 150, 19);
        Contract t1 = new Temporary(60, 30);
        Contract t2 = new Temporary(50, 60);
        Contract p3 = new Permanent(1, true, 4000, 100, 20);
        Contract p4 = new Permanent(4, true, 4500, 100, 19);

        serge.signContract(p1);
        cindy.signContract(p2);
        paul.signContract(t1);
        matt.signContract(t2);
        pierre.signContract(p3);
        sarah.signContract(p4);

        employees.add(serge);
        employees.add(cindy);
        employees.add(paul);
        employees.add(pierre);
        employees.add(matt);
        employees.add(sarah);

        displayEmployeeDetails();

        // Update Matt's contract
        Contract p5 = new Permanent(1, true, 5000, 200, 30);
        matt.signContract(p5);

        displayEmployeeDetails();
    }

    private void displayEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println("-------------------------");
            System.out.println(employee);
            System.out.println("-------------------------");
        }

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.print(employee.contractInfo());
        }
        System.out.println("-------------------------");
    }
}
