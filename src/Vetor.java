import java.util.Arrays;

/**
 * Representa uma estrutura de dados de vetor (array)
 * que armazena elementos do tipo Integer.
 */
public class Vetor {
    private Integer[] elementos; // Array interno para armazenar os dados
    private int tamanho;         // Número atual de elementos inseridos

    /**
     * Construtor da classe Vetor.
     * @param capacidade O número máximo inicial de elementos que o vetor pode armazenar.
     */
    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.tamanho = 0;
    }

    /**
     * Retorna uma representação em String da estrutura.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vetor {\n");
        sb.append("\titems: [");
        for (int position = 0; position < tamanho; position++) {
            sb.append(elementos[position]);
            if (position < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]\n");
        sb.append(String.format("\tcapacity: %d\n", elementos.length));
        sb.append(String.format("\tsize: %d\n", tamanho));
        sb.append("}");
        return sb.toString();
    }

    // Adiciona elemento ao final do vetor
    public boolean adiciona(Integer elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Adiciona elemento em uma posição específica
    public boolean adiciona(int posicao, Integer elemento) {
        if (posicao < 0 || posicao > tamanho || tamanho == elementos.length) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    // Retorna o número total de itens armazenados
    public int tamanho() {
        return this.tamanho;
    }

    /**
     * Busca um elemento pela sua posição (índice).
     */
    public Integer busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    /**
     * Busca a primeira ocorrência de um elemento e retorna sua posição (índice).
     */
    public int busca(Integer elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Remove o elemento de uma posição específica
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[tamanho - 1] = null;
        this.tamanho--;
    }
}