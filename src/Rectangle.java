public class Rectangle {

    double width;
    double length;

    public void changeWidth(double width){
        if (width<0){
            width=0;
        }
        this.width=width;
    }
    public void changeLength(double length){
        if (length<0){
            length=0;
        }
        this.length=length;
    }

    public Rectangle(double width, double length) {
         changeWidth(width);
         changeLength(length);
    }

    public double getWidth(){
       return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.width*this.length;
    }

}
