class Calculator{
    int add(int a, int b) {
        return (a + b);
    }
    double add(double a, double b) {
        return (a + b);
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("(5 + 10): "+c1.add(5, 10));
        System.out.println("(1 + 2 + 3): " + c1.add(c1.add(1, 2),3));
        System.out.println("(5.5 + 2.5): " + c1.add(5.5, 2.5));
    }
}