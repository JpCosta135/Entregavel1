import java.util.Scanner;
public class MDC {
    int a, b;
    int resto;

    public int mdc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de a: ");
        a = sc.nextInt();
        System.out.print("Valor de b: ");
        b = sc.nextInt();

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}