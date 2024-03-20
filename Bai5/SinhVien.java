package Bai5;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }
    public SinhVien() {
        super();
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.println("Nhập ngành: ");
        nganh = sc.nextLine();
        System.out.println("Nhập khóa học: ");
        khoaHoc = sc.nextInt();
        sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Ngành: " + nganh);
        System.out.println("Khóa học: " + khoaHoc);

    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

}
