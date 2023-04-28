package RefactorSesion3;

import java.util.stream.IntStream;

public class Factorial {

    public static int iterativo(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++ ) {
            resultado *= i;
        }

        return resultado;
    }

    public static int recursivo(int n) {
        if (n == 0) {
            return 1;
        }

        // Usando "tail recursion":
        return n * recursivo(n-1);
    }

    public static int funcional(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }
}
