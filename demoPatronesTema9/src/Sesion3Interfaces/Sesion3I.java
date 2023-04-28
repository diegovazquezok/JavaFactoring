package Sesion3Interfaces;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sesion3I {
    public Function<Integer,Integer> sumaFuncionalVariable = x -> IntStream.rangeClosed(1, x).reduce(0, (a, b) -> a + b);

    public class IterativeFactorialCalculator implements FactorialCalculator {
        @Override
        public int calculateFactorial(int n) {
            int resultado = 1;

            for (int i = 1; i <= n; i++ ) {
                resultado *= i;
            }

            return resultado;
        }
    }

    public class RecursiveFactorialCalculator implements FactorialCalculator {
        @Override
        public int calculateFactorial(int n) {
            if (n == 0) {
                return 1;
            }

            return n * calculateFactorial(n-1);
        }
    }

    public class FunctionalFactorialCalculator implements FactorialCalculator {
        @Override
        public int calculateFactorial(int n) {
            return IntStream.rangeClosed(1, n)
                    .reduce(1, (a, b) -> a * b);
        }
    }

    public class IterativeSumCalculator implements SumCalculator {
        @Override
        public int calculateSum(int n) {
            int result = 0;

            for (int i = 0; i <= n; i++) {
                result += i;
            }

            return result;
        }
    }

    public class RecursiveSumCalculator implements SumCalculator {
        @Override
        public int calculateSum(int n) {
            if (n == 1) {
                return 1;
            }

            return n + calculateSum(n - 1);
        }
    }

    public class FunctionalSumCalculator implements SumCalculator {
        @Override
        public int calculateSum(int n) {
            return IntStream.rangeClosed(1, n).reduce(0, (a, b) -> a + b);
        }
    }

    public class FunctionalFibonacciGenerator implements FibonacciGenerator {
        @Override
        public IntStream generateFibonacci(int max) {
            return Stream.iterate(
                    new int[]{1, 1},
                    fib -> new int[] {fib[1], fib[0] + fib[1]}
            ).mapToInt(fib -> fib[0]).limit(max);
        }
    }
}
