import java.util.Scanner;

public class AlgFund3 {

    public void soma(){
        System.out.println("Quantidade de números:");
        Scanner prompt = new Scanner(System.in);
        short n = prompt.nextShort();
        int numero;
        long soma = 0;
        short i = 0;
        while (i < n) {
            i++;
            System.out.println("Número:");
            numero = prompt.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma = " + soma);
    }
}