package thuat_Toan_Sap_xep.baitap;

public class SapXepChen {
    static void sapXepChen(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] list = {1,5,7,2,3,9,10,5};
        display(list);
        System.out.println();
        sapXepChen(list);
        display(list);
    }
}
