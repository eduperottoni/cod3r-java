package fundamentals;

public class TemperatureConvertion {
    public static void main (String[] args) {
        double farenheitTemp = 86;
        
        final int subtractor = 32;
        final double factor = 5.0/9;

        double celciusTemp = (farenheitTemp - subtractor) * factor;

        System.out.println("Temp = " + celciusTemp + "ºC");
    }
}
