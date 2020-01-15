public class CalculateArea {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(20, 40);
        System.out.println("Fläche: " + rectangle.calculateArea());
        System.out.println("Umfang: " + rectangle.calculatePerimeter());
    }
}
