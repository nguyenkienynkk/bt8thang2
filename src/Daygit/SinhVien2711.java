package Daygit;

public class SinhVien2711 {
    private String maSinhVien ;
    private String hoTen;
    private int namSInh ;
    private double diemTrungBinh ;

    public SinhVien2711(String maSinhVien, String hoTen, int namSInh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSInh = namSInh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSInh() {
        return namSInh;
    }

    public void setNamSInh(int namSInh) {
        this.namSInh = namSInh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien2711{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSInh=" + namSInh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}

