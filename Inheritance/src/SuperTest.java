class BoxWeightNew extends Box {
    double weight;

    BoxWeightNew(BoxWeightNew ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeightNew(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeightNew() {
        super();
        weight = 1;
    }

    BoxWeightNew(double len, double m) {
        super(len);
        weight = m;
    }

    void print() {
        System.out.println("Box(" + width + ", " + height + ", " + depth + ", " + weight + ")");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        BoxWeightNew box1 = new BoxWeightNew(10, 20, 15, 34.3);
        BoxWeightNew box2 = new BoxWeightNew(2, 3, 4, 0.076);
        BoxWeightNew unitBox = new BoxWeightNew();
        BoxWeightNew cube = new BoxWeightNew(3, 2);
        BoxWeightNew clone = new BoxWeightNew(box1);

        box1.print();
        box2.print();
        unitBox.print();
        cube.print();
        clone.print();
    }
}
