public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee ashik = new Employee("md", "ashik", 7777);

        Employee rafi = new Employee("md", "rafi", 7722);

        System.out.println(ashik.getFirstName() +" "+ashik.getLastName()+ "'s monthly salary is " + ashik.getMonthlySalary());
        System.out.println(rafi.getFirstName()+" " +rafi.getLastName()+ "'s monthly salary is " + rafi.getMonthlySalary());
        ashik.setMonthlySalary(ashik.getMonthlySalary()+ ashik.getMonthlySalary()* 10/100);
        rafi.setMonthlySalary(rafi.getMonthlySalary() + rafi.getMonthlySalary()* 10/100);

        System.out.println("Salary after 10% raise");

        System.out.println(ashik.getFirstName()+" " + ashik.getLastName()+"'s monthly salary is " + ashik.getMonthlySalary());
        System.out.println(rafi.getFirstName()+" " + rafi.getLastName()+"'s monthly salary is " + rafi.getMonthlySalary());
    }
}
