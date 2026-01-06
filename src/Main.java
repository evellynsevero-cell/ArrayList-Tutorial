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

        vetor.remove(0); // Essa linha remove o elemento na posição de índice 0 (o primeiro elemento) do 'vetor'. Os elementos são deslocados para preeencher o espaço.
        System.out.println(vetor); // Imprime o conteúdo atualizado da estrutura 'vetor' no console.



    }
}