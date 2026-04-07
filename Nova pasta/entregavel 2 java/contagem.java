public class Contagem {




    public void contagem(){
        byte nota = 0;
        byte n = 0;
        byte contagem = 0;
        byte i = 0;
        while (i < n) {
            i++;

            if (nota >= 0 && nota <= 10) {
                contagem++;
            }
        }
        System.out.println("Número de aprovações: " + contagem);
    }












}
