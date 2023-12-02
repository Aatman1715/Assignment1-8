//Author : Aatman Rajyaguru C0895289

public abstract class Employee {
    String name;
    int birthYear;
    Vehicle employeeVehicle;

    Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Birth Year: " + birthYear + (employeeVehicle != null ? "\n" + employeeVehicle : "");
    }

    abstract String contractInfo();

    void signContract(Contract contract) {
        // Add logic to associate the contract with the employee
    }
}
