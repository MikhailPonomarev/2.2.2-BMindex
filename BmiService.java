public class BmiService {
    public int calculateIndex(int mass, int height) {
        int reducedHeight = height * height; //приведенное значение роста (значение в квадрате)
        int bodyMassIndex = mass / reducedHeight;
        return bodyMassIndex;
    }
}
