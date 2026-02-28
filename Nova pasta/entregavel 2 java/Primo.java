import java.util.Scanner;

public class Primo {

    public boolean ehPrimo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de n: ");
        int n = sc.nextInt();

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}