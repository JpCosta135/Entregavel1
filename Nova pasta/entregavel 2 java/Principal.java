import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        Contagem a2 = new Contagem();
        a2.contagem();
        Soma a3 = new Soma();
        a3.soma();
        Primo p1 = new Primo();
        p1.ehPrimo();
        MDC m1 = new MDC();
        m1.mdc();
        System.out.print("Número de termos: ");
        int n = input.nextInt();
        Fibonacci fib = new Fibonacci();
        fib.gerar(n);

        int[] numeros = {10, 7, 8, 9, 1, 5};
        QuickSort.quicksort(numeros, 0, numeros.length - 1);
        for (int num : numeros) {
            System.out.print(num + " ");

        }


         input.close();

    }
}
