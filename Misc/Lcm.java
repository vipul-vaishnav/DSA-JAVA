
public class Lcm {
    public static void main(String[] args) {
        int n = 12;
        int m = 60;
        System.out.println(lcm(m, n));
    }

    public static int lcm(int m, int n) {
        return m * n / Hcf(m, n);
    }

    private static int Hcf(int m, int n) {
        if (n == 0)
            return m;
        return Hcf(n, m % n);
    }
}
