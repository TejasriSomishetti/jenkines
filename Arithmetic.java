import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = s.nextDouble(), b = s.nextDouble();
        System.out.println("+ " + (a+b) + " - " + (a-b) + " * " + (a*b) + " / " + (b != 0 ? a/b : "Undefined"));
        s.close();
    }
}

