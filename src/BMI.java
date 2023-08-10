public class BMI {
    public float calculate(float weight, float height) {
        float result;
        float height2;
        height2 = height * height;
        result = weight / height2;
        return (int) result;
    }
}
