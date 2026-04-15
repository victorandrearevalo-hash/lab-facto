import java.util.stream.LongStream;

// V3: Funcional
public class Factorial {
    public static long calcular(int n) {
        return LongStream.rangeClosed(1, n)
                         .reduce(1, (a, b) -> a * b);
    }
}