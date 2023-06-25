public class Cuboid extends Rectangle{
    public double getHeight() {
        return height;
    }

    public double height;
    public Cuboid(double width, double length,double height) {
        super(width, length);
        this.height=height<0? 0 :height;

    }
    public double getVolume(){
        return getArea()*height;
    }
}
