package level_01;

public class Solution_0605 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
    // Реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
    // Метод должен работать только с массивами целочисленных значений (int[]).
    public static void reverseArray(int[] array) {

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
