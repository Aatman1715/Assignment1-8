//Author : Aatman Rajyaguru C0895289

class Manager extends Employee {
    int nbClients;
    int nbTravelDays;
    double rate;
    Vehicle employeeVehicle;

    Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = rate;
    }

    Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle vehicle) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = rate;
        this.employeeVehicle = vehicle;
    }

    Manager(String name, int birthYear, int nbClients, int nbTravelDays, double rate, int nbChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = rate;
        this.employeeVehicle = null; // Set the default value, as it's not provided in this constructor
        signContract(new Permanent(nbChildren, married, monthlySalary, bonusPerChildPerMonth, accumulatedDays));
    }

    Manager(String name, int birthYear, int nbClients, int nbTravelDays, double rate, Vehicle vehicle, int nbChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = rate;
        this.employeeVehicle = vehicle;
        signContract(new Permanent(nbChildren, married, monthlySalary, bonusPerChildPerMonth, accumulatedDays));
    }

    @Override
    String contractInfo() {
        return "Manager Contract - Name: " + name + ", Monthly Rate: " + rate + "\n";
    }
}
