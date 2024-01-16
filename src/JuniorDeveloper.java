public class JuniorDeveloper extends Employee {


    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("hello jr");
    }

    public void setSalaryJr(double salary){
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }
}
