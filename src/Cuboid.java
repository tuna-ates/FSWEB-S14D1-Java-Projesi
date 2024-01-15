public class Cuboid extends Rectangle {
    double height;

    public void changeHeight(double height){
        if (height<0){
            height=0;
        }
        this.height=height;
    }

    public Cuboid(double width,double length, double height) {
        super(width,length);
        changeHeight(height);
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }
}
