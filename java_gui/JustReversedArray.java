package java_gui;

public class JustReversedArray {
    public static void main(String[] args) {
        int a[] = new int[]{10, 4, 2, 5, 1};

        for (int i = a.length - 1; i >= 0; i--) {

            System.out.print(a[i] + " ");

        }
    }
}
