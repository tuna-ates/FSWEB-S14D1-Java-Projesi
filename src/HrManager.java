import java.util.Arrays;

public class HrManager extends  Employee {

    String[] juniorDeveloper;
    String[] midDeveloper;
    String[] seniorDeveloper ;
    Grade grade;

    public HrManager(int id, String name, double salary,
                     String[] juniorDeveloper,String[] midDeveloper,
                     String[] seniorDeveloper) {

        super(id, name, salary);
        this.juniorDeveloper=juniorDeveloper;
        this.midDeveloper=midDeveloper;
        this.seniorDeveloper=seniorDeveloper;

    }

    public void addEmployee(int index,Grade grade,String name){
        if (index<0){
            System.out.println("index 0 dan küçük olamaz: "+index);
        }else {
            try {
                switch (grade){
                    case JUNIOR:

                        if (this.juniorDeveloper[index]!=null){
                            System.out.println("İlgili index alanı dolu:"+index);
                        }
                        else {
                            this.juniorDeveloper[index]=name;
                        }
                        break;
                    case MIDDLE:
                        if (this.midDeveloper[index]!=null){
                            System.out.println("İlgili index alanı dolu:"+index);
                        }
                        else {
                            this.midDeveloper[index]=name;
                        }
                        break;
                    case SENIOR:
                        if (this.seniorDeveloper[index]!=null){
                            System.out.println("İlgili index alanı dolu:"+index);
                        }
                        else {
                            this.seniorDeveloper[index]=name;
                        }
                        break;
                    default:

                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("ERROR--GİRMİŞOLDUĞUNUZ İNDEX ALANI YOK:"+index);
            }

        }



    }

    public void addEmployee(){

    }


    @Override
    public void work() {
        System.out.println("hello manaager");
    }


    @Override
    public String toString() {
        return "HrManager{" +
                "JuniorDeveloper=" + Arrays.toString(juniorDeveloper) +
                ", MidDeveloper=" + Arrays.toString(midDeveloper) +
                ", SeniorDeveloper=" + Arrays.toString(seniorDeveloper) +
                ", grade=" + grade +
                '}';
    }
}
