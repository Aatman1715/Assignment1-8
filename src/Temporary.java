//Author : Karamveer Singh C0893963
public class Temporary extends Contract {
    double hourlySalary;
    int accumulatedHours;

    Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    String contractInfo() {
        return "Temporary Contract - Hourly Salary: " + hourlySalary + ", Accumulated Hours: " + accumulatedHours + "\n";
    }
}
