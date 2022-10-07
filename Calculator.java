import org.jetbrains.annotations.NotNull;

public class Calculator {

    public static double calcAverage(double @NotNull ... nums) {
        double sum = 0;
        for(double x : nums) {
            sum += x;
        }
        return sum/nums.length;
    }
}