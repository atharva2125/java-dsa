public class a{
    int a;
    double b;
    String c;

    // Default constructor
    public a() {
        this.a = 0;
        this.b = 0.0;
        this.c = "Default";
    }

    // Parameterized constructor 1
    public a(int a) {
        this.a = a;
        this.b = 0.0;
        this.c = "Default";
    }

    // Parameterized constructor 2
    public a(int a, double b) {
        this.a = a;
        this.b = b;
        this.c = "Default";
    }

    // Parameterized constructor 3
    public a(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }

    public static void main(String[] args) {
        a obj1 = new a();
        a obj2 = new a(10);
        a obj3 = new a(20, 15.5);
        a obj4 = new a(30, 25.5, "Hello");

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}