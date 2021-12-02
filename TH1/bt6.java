package TH1;

import java.util.Scanner;

public class bt6 {
    int n;

    bt6() {
    }

    bt6(int n) {
        this.n = n;
    }

    int tongday1() {
        if (n % 2 == 1) {
            return 1 - (n - 1) / 2;
        }
        return 1 - (n - 2) / 2 + n;
    }

    int giaithua(int i) {
        int gt = 1;
        for (int j = 1; j <= i; ++j)
            gt *= j;
        return gt;
    }

    int tongday2() {
        int s = 0;
        for (int i = 1; i <= n; ++i) {
            s += giaithua(
                    i);
        }
        return s;
    }

    int tong() {
        if (n % 2 == 1) {
            return (n - 1) * ((n - 3) / 2 + 1) / 2;
        }
        return n * ((n - 4) / 2 + 1) / 2;
    }

    double tongday3() {
        double s = 0;
        for (int i = 2; i <= n; ++i) {
            s += (double) (i - 1) / i;
        }
        return s;
    }

    public static void main(String[] args) {
        bt6 b6 = new bt6();
        Scanner scanner = new Scanner(System.in);
        b6.n = scanner.nextInt();
        scanner.close();
        System.out.println(b6.tongday3());

    }
}