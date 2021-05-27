public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 68_0000; //для получения целочисленного значения к массе (кг) приписываем четыре нуля, т.к рост будет возводиться в квадрат
        int height = 175; //рост (см)
        int index = service.calculateIndex(mass, height);
        System.out.println("Индекс массы тела: " + index);
    }
}
