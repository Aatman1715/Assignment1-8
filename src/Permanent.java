//Author : Karamveer Singh C0893963

public class Permanent extends Contract {
    int nbChildren;
    boolean married;
    double monthlySalary;
    double bonusPerChildPerMonth;
    int accumulatedDays;

    Permanent(int nbChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    String contractInfo() {
        return "Permanent Contract - Monthly Salary: " + monthlySalary + ", Bonus per Child per Month: "
                + bonusPerChildPerMonth + "\n";
    }
}
