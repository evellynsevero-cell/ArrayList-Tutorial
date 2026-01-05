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



    }
}