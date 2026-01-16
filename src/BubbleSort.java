public class BubbleSort {
        public static void sort(Integer[] array, int size) {
// Laço externo: percorre o array (size - 1 vezes)
            for (int i = 0; i < size - 1; i++) {
// Laço interno: compara e troca elementos adjacentes
                for (int j = 0; j < size - 1 - i; j++) {
// Troca se elemento atual maior que o próximo
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        }
