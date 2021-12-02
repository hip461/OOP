package TH1;

import java.util.Scanner;

public class btnc {
    int n, x, k;

    int giaithua(int i) {
        int gt = 1;
        for (int j = 1; j <= i; ++j)
            gt *= j;
        return gt;
    }

    double tong() {
        double s = 0;
        for (int i = 1; i <= n; ++i) {
            s += (double) giaithua(i) / (Math.pow(x, i) - Math.pow(k, i));
        }
        return s;
    }

    public static void main(String[] args) {
        btnc nc = new btnc();
        Scanner scanner = new Scanner(System.in);
        nc.n = scanner.nextInt();
        nc.x = scanner.nextInt();
        nc.k = scanner.nextInt();
        scanner.close();
        System.out.println(nc.tong());
    }
}