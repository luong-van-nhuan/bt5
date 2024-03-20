package Bai5;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public Nguoi() {
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập quê quán: ");
        queQuan = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Quê quán: " + queQuan);
    }
}
