public class salaryWorker extends Worker {
    private final double annualSalary;

    public salaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, 0);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52.0;
    }

    public String displayWeeklyPay(double hoursWorked) {
        return String.valueOf(annualSalary / 52.0);
    }

}
