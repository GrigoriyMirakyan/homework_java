/* это то что на семинаре набросал*/
public class Homework0 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 6, 5, 7, 6, 5, 6};
        int j = 0;
        int n = 0;
        while (j < 10) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == j) {
                    n++;
                }
            }
            if (n == 2 || n == 3 || n == 4) {
                System.out.println("число " + j + " встречается " + n + " раза");
            }
            if (n == 1 || n > 4) {
                System.out.println("число " + j + " встречается " + n + " раз");
            }
            n = 0;
            j++;

        }
    }
}