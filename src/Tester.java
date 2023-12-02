//Author : Karamveer Singh C0893963

public class Tester extends Employee {
    int nbBugs;
    double rate;
    Vehicle employeeVehicle;

    Tester(String name, int birthYear, int nbBugs, double rate) {
        super(name, birthYear);
        this.nbBugs = nbBugs;
        this.rate = rate;
    }

    Tester(String name, int birthYear, int nbBugs, double rate, Vehicle vehicle) {
        super(name, birthYear);
        this.nbBugs = nbBugs;
        this.rate = rate;
        this.employeeVehicle = vehicle;
    }

    @Override
    String contractInfo() {
        return "Tester Contract - Name: " + name + ", Monthly Rate: " + rate + "\n";
    }
}
