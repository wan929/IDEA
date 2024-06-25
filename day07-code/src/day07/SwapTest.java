package day07;

public class SwapTest {
    public static void main(String[] args) {
        int[] values = {1, 2};
        System.out.println("Before swap: values[0] = " + values[0] + ", values[1] = " + values[1]);
        swap(values);
        System.out.println("After swap: values[0] = " + values[0] + ", values[1] = " + values[1]);
    }

    public static void swap(int[] values) {
        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;
    }
}
