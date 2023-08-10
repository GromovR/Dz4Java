public class Main {
    public static void main(String[] args) {
        BMI service = new BMI();
        float weight = 98;
        float height = 1.87F;
        int BMI = (int) service.calculate(weight, height);
        System.out.println((BMI) + " Индекс тела");
    }
}