package TH1;

import java.util.Scanner;

public class bt4 {
    int n;

    bt4() {
    }

    bt4(int n) {
        this.n = n;
    }

    boolean checkNguyento(int i) {
        int x = (int) Math.sqrt(n);
        for (int j = 2; j <= x; ++j) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    void showfor() {
        for (int i = 2; i < n; ++i) {
            if (checkNguyento(i))
                System.out.print(i + " ");
        }
    }

    void showwhile() {
        int i = 2;
        while (i < n) {
            if (checkNguyento(i)) {
                System.out.print(i + " ");

            }
            ++i;
        }
    }

    void showdowhile() {
        int i = 2;
        do {
            if (checkNguyento(i)) {
                System.out.print(i + " ");

            }
            ++i;
        } while (i < n);
    }

    public static void main(String[] args) {
        bt4 b4 = new bt4();
        Scanner scanner = new Scanner(System.in);
        b4.n = scanner.nextInt();
        scanner.close();
        b4.showfor();
    }
}