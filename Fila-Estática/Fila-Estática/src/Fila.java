public class Fila { // Estrutura Fila Estática
    Object[] fila; // Criando vetor Objeto
    int posicao_fila; // Variável que indica a posição da fila

    public Fila(int Tamanho) {  // Criando o construtor
        this.fila = new Object[Tamanho]; // Cria a fila com o número máximo de elementos
        this.posicao_fila = -1; // Posição da fila começa vazia
    }

    // Função que retorna um booleano se a fila está vazia
    public boolean filaVazia() {
        return this.posicao_fila == -1;
    }

    // Função para inserir elementos na fila
    public void InserirElementos(Object Elemento) {
        // Verifica se a fila está cheia
        if (this.posicao_fila >= this.fila.length - 1) {
            System.out.println("Fila CHEIA!");
        } else {
            // Adiciona o novo elemento na fila
            this.fila[++this.posicao_fila] = Elemento;
        }
    }

    // Função para imprimir os elementos da fila
    public void ImprimirFila() {
        // Verifica se a fila está vazia
        if (filaVazia()) {
            System.out.println("Fila VAZIA!");
        } else {
            // Imprime os elementos da fila
            for (int i = 0; i <= this.posicao_fila; i++) {
                System.out.println((i + 1) + "° Elemento: " + this.fila[i]);
            }
        }
    }

    // Função para acessar o primeiro elemento da fila
    public Object AcessarPrimeiro() {
        if (filaVazia()) {
            return null;
        } else {
            return this.fila[0];
        }
    }

    // Função para remover o primeiro elemento da fila
    public Object RemoverElemento() {
        if (filaVazia()) {
            return null; // Retorna null se a fila estiver vazia
        } else {
            // Armazena o primeiro elemento
            Object aux = this.fila[0];
            // Desloca todos os elementos para a esquerda
            for (int i = 0; i < this.posicao_fila; i++) {
                this.fila[i] = this.fila[i + 1];
            }
            // Diminui a posição da fila
            this.posicao_fila--;
            return aux; // Retorna o elemento removido
        }
    }
}
