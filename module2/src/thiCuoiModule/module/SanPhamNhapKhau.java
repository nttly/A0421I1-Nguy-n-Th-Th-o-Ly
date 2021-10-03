package thiCuoiModule.module;

public class SanPhamNhapKhau extends SanPham {
    private double giaNhapKhau;
    private String tinhNhap;
    private double thueNhap;

    public SanPhamNhapKhau() {

    }

    public SanPhamNhapKhau(double giaNhapKhau, String tinhNhap, double thueNhap) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhap = tinhNhap;
        this.thueNhap = thueNhap;
    }

    public SanPhamNhapKhau(int idSanPham, String maSanPham, String tenSanPham, double gia, int soLuong, String nhaSanXuat, double giaNhapKhau, String tinhNhap, double thueNhap) {
        super(idSanPham, maSanPham, tenSanPham, gia, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhap = tinhNhap;
        this.thueNhap = thueNhap;
    }

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhNhap() {
        return tinhNhap;
    }

    public void setTinhNhap(String tinhNhap) {
        this.tinhNhap = tinhNhap;
    }

    public double getThueNhap() {
        return thueNhap;
    }

    public void setThueNhap(double thueNhap) {
        this.thueNhap = thueNhap;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" + super.toString() +
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhNhap='" + tinhNhap + '\'' +
                ", thueNhap=" + thueNhap +
                '}';
    }
}
