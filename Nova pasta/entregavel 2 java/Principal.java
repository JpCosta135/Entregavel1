import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Número de notas");
        byte n = input.nextByte();
        System.out.println("Nota do aluno:");
        byte nota = input.nextByte();
        System.out.println("Quantidade de números:");
        Scanner input = new Scanner(System.in);
        short n = input.nextShort();

        Contagem a2 = new Contagem();
        a2.contagem();
        Soma a3 = new Soma();
        a3.soma();
        Primo p1 = new Primo();
        p1.ehPrimo();
        MDC m1 = new MDC();
        m1.mdc();
        System.out.print("Número de termos: ");
        int numero = input.nextInt();
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
