package TH1;
import java.util.Scanner;
public class toanhoc {
    int n;

    toanhoc() {
    }

    toanhoc(int n) {
        this.n = n;
    }

    boolean checkNguyento() {
        if (n < 2)
            return false;
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    int daonguoc(int n) {
        int m = n;
        int s = 0;
        while (m > 0) {
            s = s * 10 + m % 10;
            m /= 10;
        }
        return s;
    }

    boolean checkHoanhao() {
        if (n == daonguoc(n))
            return true;
        return false;
    }

    void sochinhphuong() {
        int i = 1;
        while (i * i < n) {
            System.out.println(i + "");
            ++i;
        }
    }

    int fibo() {
        int[] f = new int[100];
        f[0] = 1;
        f[1] = 2;
        for (int i = 2; i <= n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        toanhoc th = new toanhoc();
        Scanner scanner = new Scanner(System.in);
        th.n = scanner.nextInt();
        scanner.close();
        if (th.checkHoanhao())
            System.out.println("SO HOAN HAO\n");
        if (th.checkNguyento())
            System.out.println("SO NGUYEN TO\n");
        th.sochinhphuong();
        System.out.println(th.fibo());
    }
}