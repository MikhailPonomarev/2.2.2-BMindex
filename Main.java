public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 68; //вес (кг)
        double height = 1.75; //рост (м)
        int index = service.calculateIndex(mass, height);
        System.out.println("Индекс массы тела: " + index);
    }
}
