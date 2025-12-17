package CongTy;

public class test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien(123456,"sy tuan","nghe an");
        double luongnv1 = nv1.tinhLuong();
        System.out.println("Lương nhân viên 1 là :"+luongnv1);*/
        // tạo đối tượng
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("sytuan","hanhchinh1",111);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("Lương hc 1 là :"+luonghc1);
        // tạo đối tượng đi ca
        NhanVienDiCa ca1 = new NhanVienDiCa("1111","hâhha",111111);
        double luongca1 = ca1.tinhLuong();
        System.out.println("luong nhan vien di ca:"+luongca1);

        NhanVienDiCa ca2 = new NhanVienDiCa("1111","sytuan",11111,1);
        double luongca2 = ca2.tinhLuong();
        System.out.println("luong nhan vien ca 2:"+luongca2);
        System.out.println(ca2.ca);
        System.out.println(ca2.que);
    }
}
