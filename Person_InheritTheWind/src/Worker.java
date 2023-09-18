public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(40, hoursWorked) * hourlyPayRate;
        double overtimePay = (hoursWorked > 40) ? (hoursWorked - 40) * hourlyPayRate * 1.5 : 0;
        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(40, hoursWorked) * hourlyPayRate;
        double overtimePay = (hoursWorked > 40) ? (hoursWorked - 40) * hourlyPayRate * 1.5 : 0;
        double totalPay = regularPay + overtimePay;

        double annualSalary = 0;
        return "Regular Pay (40 hours): $" + regularPay + "\n" +
                "Overtime Pay: $" + overtimePay + "\n" +
                "Total Pay: $" + totalPay;
    }
}
