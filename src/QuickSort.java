import java.util.Scanner;


public class QuickSort {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int arr[], int low, int high) {
        int i = low, j = high;
        int temp;
        int average = arr[(low + high) / 2];


        while (i <= j) {
            while (arr[i] < average)
                i++;
            while (arr[j] > average)
                j--;
            if (i <= j) {

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(arr, low, j);


        if (i < high)
            quickSort(arr, i, high);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, i;

        System.out.println("Введите размер массива: ");
        n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("\nВведите " + n + " целых чисел:5");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        sort(arr);

        System.out.println("\nМассив после сортировки: ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
