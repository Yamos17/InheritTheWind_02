import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        //Workers
        Worker worker1 = new Worker("Anakin", "Skywalker", "000001", "Mr.", 1990, 20.0);
        Worker worker2 = new Worker("Boba", "Fett", "000002", "Ms.", 1985, 18.0);
        Worker worker3 = new Worker("Han", "Solo", "000003", "Mrs.", 1995, 22.0);

        //SalaryWorkers
        salaryWorker salaryWorker1 = new salaryWorker("Mace", "Windu", "000004", "Dr.", 1970, 100000.0);
        salaryWorker salaryWorker2 = new salaryWorker("Sheev ", "Palpatine", "000005", "Emperor", 1980, 90000.0);
        salaryWorker salaryWorker3 = new salaryWorker("Luke", "Skywalker", "000006", "Mr.", 1990, 120000.0);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");

            for (Worker worker : workers) {
                double hoursWorked = (week == 2) ? 50 : 40; //week 2
                System.out.println(worker.formalName());
                System.out.println(worker.displayWeeklyPay(hoursWorked));
                System.out.println();
            }
        }
    }
}
