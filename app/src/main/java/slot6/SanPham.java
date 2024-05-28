package slot6;

public class SanPham {
    private String masp;
    private String tensp;
    private int soluongsp;

    public SanPham(String masp, String tensp, int soluongsp) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluongsp = soluongsp;
    }

    public SanPham() {
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluongsp() {
        return soluongsp;
    }

    public void setSoluongsp(int soluongsp) {
        this.soluongsp = soluongsp;
    }
}
