public class SeniorDeveloper extends Employee{


    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("hello sn");
    }

    public void setSalarySn(double salary){
        super.setSalary(salary);
    }
    @Override
    public String toString() {
        return "" + super.toString();
    }
}
