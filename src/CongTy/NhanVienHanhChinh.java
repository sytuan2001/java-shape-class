package CongTy;

public class NhanVienHanhChinh extends NhanVien {
    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    @Override // override hiểu là tái định nghĩa hoặc là ghi đè
    public double tinhLuong() {
        return luongcoban;
    }
}
