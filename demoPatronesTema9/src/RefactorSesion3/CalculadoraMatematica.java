package RefactorSesion3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalculadoraMatematica {

    private static CalculadoraMatematica instancia = new CalculadoraMatematica();

    private CalculadoraMatematica() {}

    public static CalculadoraMatematica getInstance() {
        return instancia;
    }

    public int factorialIterativo(int n) {
        return Factorial.iterativo(n);
    }

    public int factorialRecursivo(int n) {
        return Factorial.recursivo(n);
    }

    public int factorialFuncional(int n) {
        return Factorial.funcional(n);
    }

    public int sumaIterativa(int n) {
        return Suma.iterativa(n);
    }

    public int sumaRecursiva(int n) {
        return Suma.recursiva(n);
    }

    public int sumaFuncional(int n) {
        return Suma.funcional(n);
    }

    public IntStream fibonacciFuncional(int max) {
        return Stream.iterate(
                new int[]{1, 1},
                fib -> new int[] {fib[1], fib[0] + fib[1]}
        ).mapToInt(fib -> fib[0]).limit(max);
    }
}
