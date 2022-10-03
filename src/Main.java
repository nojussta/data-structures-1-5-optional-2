import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 7, 3, 1, 5, 2, 6, 2};
        int[] test = TaskUtils.SlidingWindowMaximum(intArray, 4);
        System.out.println(String.format("Atsakymas yra: %s", Arrays.toString(test)));
    }
}

