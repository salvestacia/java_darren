import java.util.ArrayList;
import java.util.Scanner;

public class JavaSorting {
    private static ArrayList<Integer> dataArray = new ArrayList<>();

    public static void menuSort() {
        int pilihan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Silahkan pilih metode sorting");
        System.out.println("============");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Keluar");

        System.out.print("Pilihan anda: ");
        pilihan = scanner.nextInt();

        if (pilihan == 1) {
            selectionSort();
        } else if (pilihan == 2) {
            bubbleSort();
        } else if (pilihan == 3) {
            System.exit(0);
        }
    }

    public static void selectionSort() {
        int n = dataArray.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (dataArray.get(j) < dataArray.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = dataArray.get(minIndex);
            dataArray.set(minIndex, dataArray.get(i));
            dataArray.set(i, temp);

            // Print the sorting process
            System.out.println("Selection Sort Step " + (i + 1) + ": " + dataArray);
        }
    }

    public static void bubbleSort() {
        int n = dataArray.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dataArray.get(j) > dataArray.get(j + 1)) {
                    int temp = dataArray.get(j);
                    dataArray.set(j, dataArray.get(j + 1));
                    dataArray.set(j + 1, temp);

                    // Print the sorting process
                    System.out.println("Bubble Sort Step " + (i + 1) + ": " + dataArray);
                }
            }
        }
    }

    public static void main(String[] args) {
        JavaSorting obj = new JavaSorting();

        System.out.println("Masukkan angka sebagai nilai Array");
        System.out.println("----------------------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int dataSize = input.nextInt();

        for (int i = 0; i < dataSize; i++) {
            System.out.print("Masukkan data ke-" + i + " = ");
            dataArray.add(input.nextInt());
        }

        System.out.println("");
        JavaSorting.menuSort();
        System.out.println("");

        System.out.println("Sorted Array: " + dataArray);
    }
}
