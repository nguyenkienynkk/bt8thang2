package QuanLyQuanKaraoke;

public class PhongKaraoke {
    private String tenPhong;
    private String maPhong;
    private int gioBatDau;
    private int gioKetThuc;

    public PhongKaraoke(String tenPhong, String maPhong, int gioBatDau, int gioKetThuc) {
        this.tenPhong = tenPhong;
        this.maPhong = maPhong;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(int gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public int getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(int gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    @Override
    public String toString() {
        return "PhongKaraoke{" +
                "tenPhong='" + tenPhong + '\'' +
                ", maPhong='" + maPhong + '\'' +
                ", gioBatDau=" + gioBatDau +
                ", gioKetThuc=" + gioKetThuc +
                '}';
    }
}
