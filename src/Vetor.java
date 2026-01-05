import java.util.Arrays;



/**
 * Representa uma estrutura de dados de vetor (array)
 * que armazena elementos do tipo String.
 */
public class Vetor {
    private Integer[]elementos; // Array interno para armazenar os dados
    private int tamanho;       // Número atual de elementos inseridos

    /**
     *  Contrutor da classe Vetor.
     * @param capacidade 0 número máximo inicial de elementos que o vetor pode armazenar.
     */
    public Vetor(int capacidade) {
        // Inicializa o array com a capacidade definida
        this.elementos = new Integer[capacidade];
        // 0 vetor começa vazio
        this.tamanho = 0;
    }
    /**
     * Retorna uma representação em String da estrutura.
     * O formato inclui:
     * * a lista de elementos inseridos (separados por vírgula),
     * * a capacidade total do array interno, e
     * * o tamanho logico atual.
     * @return Uma String contendo o estado atual da estrutura.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vetor {\n");
        sb.append("\titems: [");
        for (int position = 0; position < size; position++) {
        sb.append(items[position]);
        if (position < size - 1){
            sb.append(", ");
        }

    }
        sb.append("]\n");
        sb.append(String.format("\tcapacity: %d\n", items.length));
        sb.append(String.format("tsize: %d/n" , size));
        sb.append("}");
        return  sb.toString();
}

// Métodos para adicionar, buscar, remover, etc. serão implementados aqui...

public boolean adiciona(Integer elemento) {
    // Verifica se ainda há espaço no array ' elementos' .
    if (this.tamanho < this.elementos.length) {
        // Adiciona o 'elemento' na proxima posição disponivel.
        this.elementos[this.tamanho] = elemento;
        // Incrementa o contador de elementos.
        this. tamanho++;
        // Indica que a adição foi bem-sucedida.
        return  true;
    }
    // indica que a adição falhou (array cheio).
    return false;
    }
}