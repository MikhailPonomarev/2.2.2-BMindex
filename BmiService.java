public class BmiService {
    public int calculateIndex(double mass, double height) {
        double reducedHeight = height * height; //приведенное значение роста (значение в квадрате)
        double bodyMassIndex = mass / reducedHeight;
        return (int) bodyMassIndex;
    }
}
