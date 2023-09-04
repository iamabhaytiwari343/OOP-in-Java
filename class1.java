class sample {
    int a;
    int b;
    String s;

    void show() {
        System.out.println(" " + a + " " + b + " " + s);
    }

}public class class1 {

    public static void main(String args[]) {
        sample c = new sample();
        c.a = 20;
        c.b = 30;
        c.s = "HELLO";
        c.show();
    }
}
