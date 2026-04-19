class Construct {
    int c;
    Construct(int a, int b) {
        c = a + b;
        System.out.println(c);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Construct obj = new Construct(5, 10);
        System.out.println(obj.c);
    }
}
