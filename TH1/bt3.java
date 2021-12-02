package TH1;

import java.util.Scanner;

public class bt3 {
    private int date, month, year;
    private int n;

    bt3() {
    }

    bt3(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void calculator() {
        this.n = (month - 1) * 30 + date;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            this.n += 1;
    }

    void show() {
        System.out.println("Ngay : " + n);
    }

    public static void main(String[] args) {
        bt3 b3 = new bt3();
        Scanner scanner = new Scanner(System.in);
        b3.setDate(scanner.nextInt());
        b3.setMonth(scanner.nextInt());
        b3.setYear(scanner.nextInt());
        scanner.close();
        b3.show();
    }
}