import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        double a , b, c, u, A;
        Scanner input = new Scanner(System.in);
        System.out.print(" a kenarının uzunluğunu giriniz :");
        a = input.nextDouble();

        System.out.print(" b kenarının uzunluğunu giriniz :");
        b = input.nextDouble();

        System.out.print(" c kenarının uzunluğunu giriniz :");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        A = Math.sqrt(u*(a+b)*(b+c)*(a+c));
        System.out.print(" Üçegenin alanı : " + A);


    }
}
