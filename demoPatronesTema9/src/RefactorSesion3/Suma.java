package RefactorSesion3;

import java.util.stream.IntStream;

public class Suma {

    public static int iterativa(int n) {
        int resultado = 0;

        for (int i = 0; i <= n; i++) {
            resultado += i;
        }

        return resultado;
    }

    public static int recursiva(int n) {
        return sumaRecursivaAux(n, 0);
    }

    private static int sumaRecursivaAux(int n, int acumulado) {
        if (n == 0) {
            return acumulado;
        }

        return sumaRecursivaAux(n-1, acumulado + n);
    }

    public static int funcional(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(0, (a, b) -> a + b);
    }
}
