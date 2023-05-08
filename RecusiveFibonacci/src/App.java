public class App {
    public static void main(String[] args) throws Exception {

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(-2);
    }
}
