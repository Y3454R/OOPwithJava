class Figure {
    double d1, d2;

    Figure(double a, double b) {
        this.d1 = a;
        this.d2 = b;
    }

    public double area() {
        System.out.println("Area for figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        System.out.println("Inside area for Rectangle.");
        return d1 * d2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        System.out.println("Inside area for Triangle.");
        return (d1 * d2) / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 20);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure refObj;

        refObj = f;
        System.out.println("Area: " + refObj.area());

        refObj = r;
        System.out.println("Area: " + refObj.area());

        refObj = t;
        System.out.println("Area: " + refObj.area());
    }
}
