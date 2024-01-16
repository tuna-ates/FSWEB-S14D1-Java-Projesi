import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Circle1 circle1=new Circle1(3.75);
        System.out.println("radius:"+circle1.getRadius());
        System.out.println("area:"+circle1.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());*/




        /*Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());*/



        String[] jr= new String[3];
        String[] md=new String[3];
        String[] sn=new String[3];

        JuniorDeveloper juniorDeveloper=new JuniorDeveloper(1,"tuna",13000);
        System.out.println("---------------------");
        juniorDeveloper.work();
        HrManager hrManager=new HrManager(1,"tuna",12500,
                jr,md,sn);

        hrManager.addEmployee(2,Grade.JUNIOR,String.valueOf(juniorDeveloper));
        hrManager.addEmployee(1,Grade.JUNIOR,"jr1");
        hrManager.addEmployee(1,Grade.JUNIOR,"jr2");
        hrManager.addEmployee(1,Grade.MIDDLE,"md1");
        hrManager.addEmployee(4,Grade.MIDDLE,"md1");
        System.out.println(hrManager);



    }
}