import java.util.Scanner;
class Shape {
    public static double rectangleArea(double length, double width){
    return length*width;
}

    public static double circleArea(double area) {
        double pI = 3.14;
       return (area * pI);
    }

    public static double squareArea(double length) {
        return (length * length);
    }

    public static void main(String[] args) {
    double length, width;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input length for Rectangle:");
        length = scanner.nextDouble();
        System.out.print("Please input high for Rectangle: ");
        width = scanner.nextDouble();
        System.out.println("Rectangle's Area is:" + rectangleArea(length,width));

        System.out.print("Please input the radius for Circle: ");
        length = scanner.nextDouble();
        System.out.println("Circle Area is: " + circleArea(length));

        System.out.print("Please input the length for Square: ");
        length = scanner.nextDouble();
        System.out.println("Square Area is: " + squareArea(length));


    }
}

