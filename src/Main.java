public class Main {
    public static void main(String[] args) {
        // Inicializa um objeto 'Vetor' capaz de armazenar 5 elementos.
        Vetor vetor = new Vetor(5);

        /**
         * Imprime o estado inicial do vetor no console.
         * Espera-se a saída:
         * Vetor {
         *  items: []
         *  capacity: 5
         *  size: 0
         * }
         **/
        System.out.println(vetor);

        vetor.adiciona(10);
        vetor.adiciona(20);

        System.out.println(vetor);

        // Exibe o tamanho atual do vetor
        System.out.println("Tamanho atual: " + vetor.tamanho());

        // Busca e exibe o item na posição 0
        System.out.println("Item na posição 0: " + vetor.busca(0));

        // Busca e exibe a posição da primeira ocorrência do elemento 20
        System.out.println("Posição do Elemento 20: " + vetor.busca(20));

        vetor.remove(0); // Remove o elemento na posição de índice 0

        System.out.println(vetor); // Imprime o conteúdo atualizado

        // Adiciona um novo item na posição 0, tornando-o o primeiro elemento
        vetor.adiciona(0, 99); // Use um Integer, pois seu Vetor armazena Integer

        // Exibe o conteúdo atualizado do vetor
        System.out.println(vetor);
    }
}