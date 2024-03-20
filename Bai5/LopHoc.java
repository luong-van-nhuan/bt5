package Bai5;

import java.util.*;

public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    private List<SinhVien> x = new ArrayList<>();
    private int n;
    private String giaoVien;

    public LopHoc(String maLH, String tenLH, String ngayMo, List<SinhVien> x, int n, String giaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.x = x;
        this.n = n;
        this.giaoVien = giaoVien;
    }

    public LopHoc() {
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã lớp học: ");
        maLH = sc.nextLine();
        System.out.println("Nhập tên lớp học: ");
        tenLH = sc.nextLine();
        System.out.println("Nhập ngày mở: ");
        ngayMo = sc.nextLine();
        System.out.println("Nhập tên giáo viên: ");
        giaoVien = sc.nextLine();
        System.out.println("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhap();
            x.add(sinhVien);
        }
    }
    public void xuat() {
        System.out.println("Mã lớp học: " + maLH);
        System.out.println("Tên lớp học: " + tenLH);
        System.out.println("Ngày mở: " + ngayMo);
        System.out.println("Tên giáo viên: " + giaoVien);
        for (SinhVien sv : x) {
            sv.xuat();
        }
    }
    public int demSoSV() {
        int dem = 0;
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).getKhoaHoc() == 14) {
                dem++;
            }
        }
        return dem;
    }
    public void sapXepTheoKhoaHoc(){
        Collections.sort(x, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o2.getKhoaHoc() - o1.getKhoaHoc();
            }
        });
    }

}