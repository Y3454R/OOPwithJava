class Box {
    double width, height, depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = 1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class PracticalExample {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        System.out.println(weightBox.weight);
        Box plainBox = weightBox;
        System.out.println(plainBox.volume());
//        System.out.println(plainBox.weight);
        Box box = new Box(1, 2, 3);
//        BoxWeight wbox = box;
        // Test
        System.out.println("My test:");
        Box boxTest = new BoxWeight(1, 2, 3, 8);
//        System.out.println(boxTest.weight); // hobe na
        System.out.println(boxTest.volume());
//        BoxWeight boxWeightTest = boxTest; // hobe na
    }
}
