import java.util.Scanner;

public class AlgFund2 {

    public void contagem(){
        System.out.println("Número de notas");
        Scanner prompt = new Scanner(System.in);
        byte n = prompt.nextByte();
        byte nota;
        byte contagem = 0;
        byte i = 0;
        while (i < n) {
            i++;// i += 1;   i = (byte)(i + 1);
            System.out.println("Nota do aluno:");
            nota = prompt.nextByte();
            if (nota >= 0 && nota <= 10) {
                contagem++;
            }
        }
        System.out.println("Número de aprovações: " + contagem);
    }
}