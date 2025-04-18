public class test {

    public static void result(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        result(5);
    }
}