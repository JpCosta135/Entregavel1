import java.util.Scanner;

    public class Fibonacci {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Número de termos: ");
            int n = sc.nextInt();

            int a = 0;
            int b = 1;
            int i = 2;
            int c;

            if (n == 1) {
                System.out.print(a);
            } else if (n >= 2) {
                System.out.print(a + ", " + b);

                while (i < n) {
                    c = a + b;
                    System.out.print(", " + c);
                    a = b;
                    b = c;
                    i++;
                }
            }

            sc.close();
        }
    }