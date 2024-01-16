public class MidDeveloper extends  Employee {

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("hello md");
    }

    public void setSalaryMd(double salary){
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }
}
