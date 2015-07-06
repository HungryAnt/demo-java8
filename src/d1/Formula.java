package d1;

/**
 * Created by ant on 2015/7/6.
 */
public interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
