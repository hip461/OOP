package TH1;

import java.util.Scanner;

public class bt2 {
    private int n;
    private String bin = "";

    bt2() {
    }

    bt2(int n) {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getBin() {
        return bin;
    }

    void converted() {
        int m = n;
        while (m > 0) {
            bin += (m % 2);
            m /= 2;
        }
    }

    void show() {
        System.out.println("Bin of " + n + " = " + bin);
    }

    public static void main(String[] args) {
        bt2 b2 = new bt2();
        Scanner scanner = new Scanner(System.in);
        b2.setN(scanner.nextInt());
        scanner.close();
        b2.show();
    }
}