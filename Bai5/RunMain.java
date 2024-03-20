package Bai5;

import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        lopHoc.nhap();
        System.out.println("Số sinh viên khóa 14: " + lopHoc.demSoSV());
        System.out.println("Thông tin lớp học và sinh viên");
        lopHoc.sapXepTheoKhoaHoc();
        lopHoc.xuat();
        sc.close();
    }
}
