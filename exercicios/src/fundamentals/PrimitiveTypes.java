package fundamentals;

public class PrimitiveTypes {
    
    /**
     * Tipos primitivos em Java
     * 
     * --> Tipos numéricos:
     * ----> Byte : 1 byte
     * ----> Short: 2 bytes
     * ----> Int  : 4 bytes
     * ----> Long : 8 bytes
     * ----> Float  : 4 bytes
     * ----> Double : 8 bytes
     * 
     * --> Outros tipos:
     * ----> Char : 1 byte
     * ----> Bool : 1 bit
     */

    public static void main (String[] args) {
        byte WorkedYears = 23;
        short travels = 5463;
        int id = 238563;
        // Como o padrão de conversão de literais é converter para int e double,
        // quando ocorre declaração de long e float, deve-se utilizar
        // letras pós-fixadas L e F
        long accPoints = 34_563_456_345_634L;
        float salary = 4.75F;
        double money = 3.789000;
        
        boolean estaDeFerias = true;
        char caractere = 'A';
        char caractere2 = '\u0100';    
    }
     
}
