public class Main {
    public static void main(String[] args) {
        // Inicializa um objeto 'Vetor' capaz de armazenar 5 elementos.
        Vetor vetor = new Vetor(5);
        /**
         * Imprime o estado inicial do vetor no console.
         * Espera-se a saída:
         * Vetor {
         *      items: []
         *      capacity: 5
         *      size: 0
         * }
         **/
        vetor .adiciona(10);
        vetor .adiciona(20);
        System.out.println(vetor);

        // Exibe o tamanho atual do vetor
        System.out.println("Tamanho atual: " + vetor.tamanho());

        // Busca e exibe o item na posição 0
        System.out.println("Item na posição 0: " + vetor.busca(0));

        // Busca e exibe a posição da primeira ocorrencia do elelmento "Eelemento 2"
        System.out.println("Posição do Elemento 2: " + vetor.busca("Elemento 2"));



    }
}