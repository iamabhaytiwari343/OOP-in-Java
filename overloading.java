class adder {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class overloading {
    public static void main(String args[]) {
        adder a = new adder();
        adder b = new adder();
        adder c = new adder();
        System.out.println(a.add(2, 2));
        System.out.println(b.add(2, 2, 30));
        System.out.println(c.add(2.3, 2.5));
    }
}
