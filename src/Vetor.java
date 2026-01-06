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
     * O formato inclui:
     * - a lista de elementos inseridos (separados por vírgula),
     * - a capacidade total do array interno, e
     * - o tamanho lógico atual.
     * @return Uma String contendo o estado atual da estrutura.
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
        sb.append(String.format("\ttsize: %d\n", tamanho));
        sb.append("}");
        return sb.toString();
    }

    // Métodos para adicionar, buscar, remover, etc. serão implementados aqui...

    public boolean adiciona(Integer elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
}
// Retorna o número total de itens armazenados
public int tamanho() {
    return this.tamanho;
}
/**
 *  Busca um elemento pela sua posição (índice).
 *  Exemplo: Qual elemento está na posição 1?
 *
 * @param posicao 0 índice do elemento a ser buscado.
 * @return 0 elemento (String) encontrado na posição.
 * @throws java.lang.IllegalArgumentException Se a posição for inválida
 (fora do intervalo [0, tamanho-1]).
 */
public Integer busca(int posicao) {
    if (!(posicao >= 0 &&  posicao < tamanho)) {
        throw  new IllegalArgumentException("Posição inválida. ");
    }
    return this.elementos[posicao];
}
/**
 * Busca a primeira ocorrencia de um elemento e retorna sua posição (índice).
 * Exemplo: Em qual posição está o elemento 'Java'?
 *
 * @param elemento 0 conteúdo (String) a ser procurado.
 * @return 0 índice (posição) do elemento, ou -1 se não for encontrado.
 */
public int busca(Integer elemento) {
    for (int i = 0; i < this.tamanho; i++) {
        if (this.elementos[i].equals(elemento)) {
            return i;
        }
    }
    // Não encontrado
    return -1;
}
public void remove(int posicao) {
    // 1. Validação da posição:
    // Verifica se a posição está dentro dos limites válidos (0 até tamanho -1).
    if (!(posicao >= 0 && posicao < tamanho)) {
        throw new IllegalArgumentException("Posição inválida");
    }
    // 2. Deslocamento dos Eelementos:
    // Move os elementos á direita da posição a ser removida uma posição para a esquerda.
    for (int i = posicao; i < this.tamanho -1; i++) {
        this.elementos[i + 1];
    }

    // 3. Atualização do Tamanho:
    // Decrementa o contador de itens da lista.
    this.tamanho--;
}
