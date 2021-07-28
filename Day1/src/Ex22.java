class Employee{
    public int empId;
    public String firstName;
    public String lastName;
    public String email;
    public void getFullName(){
        System.out.println(this.firstName + " "+ this.lastName);
    }
}
class FullTimeEmployee extends Employee{
    public int annualSalary;
}
class PartTimeEmployee extends Employee{
    public int hourSalary;
}
public class Ex22 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Mark";
        fte.lastName  ="John";
        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Soul";
        pte.lastName  ="moe";
        fte.getFullName();
        pte.getFullName();

        Employee emp = new Employee();

    }
}
