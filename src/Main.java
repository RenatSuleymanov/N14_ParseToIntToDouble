import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        String S = in.nextLine();
        System.out.println("string " + S);
        int X = Integer.parseInt(S.trim());
        System.out.println("int " + X);
        double Y = X;
        System.out.println("double " + Y);
        }
}