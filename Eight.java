import java.util.*;

public class Eight {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of slary in Dollar : ");
        int a = input.nextInt();
        System.out.println("Enter the work hours : ");
        int b = input.nextInt();

        Employee emp = new Employee();

        emp.getInfo(a, b);
        emp.addSal();
        emp.addWork();
        emp.finalSalary();

        input.close();
    }

}

class Employee {
    int salary;
    int work_hours;

    public void getInfo(int a, int b) {
        salary = a;
        work_hours = b;
    }

    public void addSal() {
        if (salary < 500)
            salary = salary + 10;
    }

    public void addWork() {
        if (work_hours > 6)
            salary = salary + 5;
    }

    public void finalSalary() {
        System.out.println("The total salary is : " + salary);
    }
}
