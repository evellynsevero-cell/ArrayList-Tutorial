public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        System.out.println(vetor);
        vetor.adiciona(50);
        vetor.adiciona(20);
        vetor.adiciona(10);
        vetor.adiciona(30);

        // System.out.println(vetor);
        // System.out.println("Tamanho atual: " + vetor.tamanho());
        //System.out.println("Item na posição 0: " + vetor.busca(0));
        // System.out.println("Posição do Elemento 20: " + vetor.busca(20));
        // vetor.remove(0);
        // System.out.println(vetor);

        System.out.println("Antes: " + vetor);

        //vetor.sort(Vetor.SortType.SELECTION);
        //vetor.sort(Vetor.SortType.INSERTION);
        vetor.sort(Vetor.SortType.BUBBLE); // Corrigido aqui!

        System.out.println("Depois: " + vetor);
    }
}
