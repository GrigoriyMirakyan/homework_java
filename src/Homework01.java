import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Integer[] arr = fillArray();
        Integer[] uniqueArr = unique(arr);
        result(arr, uniqueArr);
    }

    static Integer[] fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер создаваемого массива: ");
        int size = sc.nextInt();
        Integer[] myArray = new Integer[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }

    static Integer[] unique(Integer[] arr) {
        return Arrays.stream(arr).distinct().toArray(Integer[]::new);// эту строчку нагуглил, такого мы еще не проходили
    }

    static void result(Integer[] arr, Integer[] uniqueArr) {
        int n = 0;
        for (int j = 0; j < uniqueArr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == uniqueArr[j]) {
                    n++;
                }
            }
            if (n > 0) {
                System.out.println("число " + uniqueArr[j] + " встречается " + n + " раз(а)");
                n = 0;
        }
    }
}
}
