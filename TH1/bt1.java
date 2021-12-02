package TH1;

import java.util.Scanner;

public class bt1 {
    private int i;

    bt1() {
    }

    bt1(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    void increment() {
        ++i;
    }

    void decrement() {
        --i;
    }

    void show() {
        System.out.println("I - 1 = " + (i - 1) + "\nI + 1 = " + (i + 1));
    }

    public static void main(String[] args) {
        bt1 b1 = new bt1();
        System.out.print("Nhap i : ");
        Scanner scanner = new Scanner(System.in);
        b1.setI(scanner.nextInt());
        b1.show();
        scanner.close();
    }
}