public class Hanoj {
    public static void main(String[] args) {
        hanojTower(3, "1", "3", "2");
    }
    public static void hanojTower(int n, String source, String target, String buffer){
        if (n == 1) {
            System.out.printf("%d from %s to %s", n, source, target);
            System.out.println();
            return;
        }
        hanojTower(n - 1, source, buffer, target);
        System.out.printf("%d from %s to %s", n, source, target);
        System.out.println();
        hanojTower(n - 1, buffer,target, source);
    }
}