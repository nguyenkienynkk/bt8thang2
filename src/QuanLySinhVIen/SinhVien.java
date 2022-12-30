package QuanLySinhVIen;

import java.util.Arrays;

public class SinhVien {
    // Tên SV, mã Sv, giới tính, năm sinh, điểm trung bình môn) và lớp môn học ( mã môn, tên môn, số lượng học sinh học, ngày bắt đầu).
    private String tenSv;
    private String maSv;
    private int gioiTinh;
    private double diemTrungBinh;

    private MonHoc [] monHocs ;

    public SinhVien(String tenSv, String maSv, int gioiTinh, double diemTrungBinh) {
        this.tenSv = tenSv;
        this.maSv = maSv;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
        this.monHocs = monHocs;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public MonHoc[] getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(MonHoc[] monHocs) {
        this.monHocs = monHocs;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "tenSv='" + tenSv + '\'' +
                ", maSv='" + maSv + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", diemTrungBinh=" + diemTrungBinh +
                ", monHocs=" + Arrays.toString(monHocs) +
                '}';
    }

    public void inThongTinSinhVien() {
        String name1 = gioiTinh == 1 ? "nam" : gioiTinh == 0 ? "nu" : "be de";
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Tên: " + tenSv + "- Mã sinh viên: " + maSv + "-Giới tính : " + gioiTinh + "- Điểm trung bình: " + diemTrungBinh );
    }
}
