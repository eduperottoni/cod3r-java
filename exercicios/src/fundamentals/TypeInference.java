package fundamentals;

public class TypeInference {

    public static void main(String[] args) {
        double a; // variável declarada
        a = 9.78; // variável inicializada

        // In this case, the type of b is infered for Java 
        // as a double, because of its value
        var b = 7.88;

        System.out.println("Value with type inferred = " + b);
    }
}
