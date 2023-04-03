public class Employee {
    String firstName;
    String lastName;
    int monthlySalary;
    public void setData(String firstName, String lastName, int monthlySalary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonthlySalary() {
        if (monthlySalary<0){
            monthlySalary=0;
            return monthlySalary;
        }else
        return monthlySalary;

    }public void displayYearlySalary(int monthlySalary){
        int yearlySalary=monthlySalary*12;

    }


}
