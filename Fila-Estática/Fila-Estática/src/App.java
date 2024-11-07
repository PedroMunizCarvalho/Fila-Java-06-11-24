

public class App {
    public static void main(String[] args) throws Exception {
        Fila F1 = new Fila(5);
        
        F1.InserirElementos("Aluno Pedro");
        F1.InserirElementos("Bolo");
        F1.InserirElementos("ADS_2_Serie");
        // Imprimir os elementos da fila dos 3
        F1.ImprimirFila();
        System.out.println();
        F1.InserirElementos("Livro de Java");
        F1.InserirElementos("Caderno de Notas");

        // Tentar inserir mais um elemento, quando a fila já está cheia
        F1.InserirElementos("Elemento extra");
        System.out.println();
        F1.ImprimirFila();
        F1.RemoverElemento();
        F1.InserirElementos("Elemento extra");
        System.out.println();
        F1.ImprimirFila();
    }
}
