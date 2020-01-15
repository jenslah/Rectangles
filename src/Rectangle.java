public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length=0;
        width=0;
    }

    Rectangle(double length, double width){
        this.length=length;
        setWidth(width);
    }

    public void setLength(double length){
        this.length=length;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
        return (length*2 + width*2);
    }
}