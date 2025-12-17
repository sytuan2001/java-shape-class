package CongTy;

public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongcoban=850;


    // construction    cmd+n

    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    public abstract double tinhLuong();

}
