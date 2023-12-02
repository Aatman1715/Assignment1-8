//Author : Aatman Rajyaguru C0895289

class Programmer extends Employee {
    int nbProjects;
    double rate;
    Vehicle employeeVehicle;

    Programmer(String name, int birthYear, int nbProjects, double rate) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.rate = rate;
    }

    Programmer(String name, int birthYear, int nbProjects, double rate, Vehicle vehicle) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.rate = rate;
        this.employeeVehicle = vehicle;
    }

    Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.employeeVehicle = vehicle;
    }

    @Override
    String contractInfo() {
        return "Programmer Contract - Name: " + name + ", Monthly Rate: " + rate + "\n";
    }
}
