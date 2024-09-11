public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                n -= 1;
            } else {
                n = n / 2;
            }

            count += 1;
        }

        System.out.println(count);
    }
}
