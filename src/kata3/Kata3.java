package kata3;
public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.icrement("hey");
        histogram.icrement("hey");
        histogram.icrement("that's");
        histogram.icrement("that's");
        histogram.icrement("that's");
        histogram.icrement("pretty");
        histogram.icrement("pretty");
        histogram.icrement("good");
        histogram.icrement("hey");
        histogram.icrement("hey");
        new HistogramDisplay(histogram).execute();
    }
    
}
