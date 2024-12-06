import java.util.*;

public class TestSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Shell Sort");

        int choice = scanner.nextInt();
        int[] sizes = {10_000, 100_000, 500_000}; // Tamanhos dos arrays
        int repetitions = 3; // Número de repetições para cada cenário

        for (int size : sizes) {
            System.out.println("\nTamanho do array: " + size);

            for (int cenario = 1; cenario <= 2; cenario++) { // Cenários limitados a strings
                System.out.println("\nCenário " + cenario);
                for (int i = 0; i < repetitions; i++) {
                    String[] array = generateStringArray(size, cenario); // Geração de array de strings
                    long timeTaken = 0;

                    switch (choice) {
                        case 1 -> timeTaken = measureTime(() -> BubbleSort.sort(array.clone()));
                        case 2 -> timeTaken = measureTime(() -> MergeSort.sort(array.clone()));
                        case 3 -> timeTaken = measureTime(() -> QuickSort.sort(array.clone(), 0, array.length - 1));
                        case 4 -> timeTaken = measureTime(() -> ShellSort.sort(array.clone()));
                        default -> {
                            System.out.println("Opção inválida!");
                            return;
                        }
                    }
                    System.out.printf("Tentativa %d: %d µs%n", i + 1, timeTaken);
                }
            }
        }
    }

    // Gera arrays de strings baseados no cenário
    private static String[] generateStringArray(int size, int cenario) {
        Random random = new Random();
        if (cenario == 1) {
            // Cenário 1: Array ordenado (a, b, c, ...)
            return random.ints(size, 0, 26)
                         .mapToObj(i -> String.valueOf((char) ('a' + i)))
                         .sorted()
                         .toArray(String[]::new);
        } else {
            // Cenário 2: Array aleatório de strings
            return random.ints(size, 0, 26)
                         .mapToObj(i -> String.valueOf((char) ('a' + i)))
                         .toArray(String[]::new);
        }
    }

    private static long measureTime(Runnable task) {
        long start = System.nanoTime();
        task.run();
        return (System.nanoTime() - start) / 1_000; 
    }
}
