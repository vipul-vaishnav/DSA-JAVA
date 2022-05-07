
public class Hcf {
    public static void main(String[] args) {
        int m = 12;
        int n = 60;
        System.out.println(hcf(m, n));

        int a = 7;
        int b = 13;
        System.out.println(hcf(a, b));
    }

    private static int hcf(int m, int n) {
        if (n == 0)
            return m;
        return hcf(n, m % n);
    }
}
