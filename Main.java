public class Main {

    public static int x=1;
    public static int y=1;
    public static int z=1;
    public static int z2=2;
    public static int z3=1;
    public static int a=2;
    public static int b=0;
    public static int b2=1;
    public static int b3=1;

    public static void main(String[] args) {

        System.out.print("First 10 Square Numbers: ");
        perfectSquares();
        System.out.println();
        System.out.print("First 10 Cube Numbers: ");
        perfectCubes();
        System.out.println();
        System.out.print("First 10 Fibonacci Numbers from 1: ");
        fibonacciSequence();
        System.out.println();
        System.out.print("First 10 Prime Numbers: ");
        primeNumbers();
        System.out.println();
        System.out.print("First 10 Triangle Numbers: ");
        triangleNumbers();
        System.out.println();
    }

    public static void perfectSquares() {
        do {
            System.out.print((int)Math.pow(x,2)+" ");
            x=x+1;
        } while (x<11);
    }

    public static void perfectCubes() {
        do {
            System.out.print((int)Math.pow(y,3)+" ");
            y=y+1;
        } while (y<11);
    }

    public static void fibonacciSequence() {
        do {
            z3=z;
            z=z2;
            z2=z3+z2;
            System.out.print(z3+" ");
        } while (z3!=89);
    }

    public static void primeNumbers() {
        do {
            if (a==2 || a==3 || a==5 || a==7 || a==11 || a==13 || a==17 || a==19 || a==23 || a==29) {
                System.out.print(a + " ");
            }
            a=a+1;
        } while (a<30);
    }

    public static void triangleNumbers() {
        do {
            b3=b+b2;
            System.out.print(b3+" ");
            b=b3;
            b2=b2+1;
        } while (b3!=55);
    }
}