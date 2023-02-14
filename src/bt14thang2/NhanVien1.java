package bt14thang2;

import java.time.LocalDateTime;

public class NhanVien1 {
    private String tenNhanVien;
    private String maNhanVien;
    private int tuoinv;
    private String quequan;
    private int gioiTinh;
    private LocalDateTime thoiGianCheckIn;
    private LocalDateTime thoiGianCheckOut;
    private int status;

    public NhanVien1(String tenNhanVien, String maNhanVien, int tuoinv, String quequan, int gioiTinh) {
        this.tenNhanVien = tenNhanVien;
        this.maNhanVien = maNhanVien;
        this.tuoinv = tuoinv;
        this.quequan = quequan;
        this.gioiTinh = gioiTinh;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getTuoinv() {
        return tuoinv;
    }

    public void setTuoinv(int tuoinv) {
        this.tuoinv = tuoinv;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDateTime getThoiGianCheckIn() {
        return thoiGianCheckIn;
    }

    public void setThoiGianCheckIn(LocalDateTime thoiGianCheckIn) {
        this.thoiGianCheckIn = thoiGianCheckIn;
    }

    public LocalDateTime getThoiGianCheckOut() {
        return thoiGianCheckOut;
    }

    public void setThoiGianCheckOut(LocalDateTime thoiGianCheckOut) {
        this.thoiGianCheckOut = thoiGianCheckOut;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NhanVien1{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", maNhanVien='" + maNhanVien + '\'' +
                ", tuoinv=" + tuoinv +
                ", quequan='" + quequan + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", thoiGianCheckIn=" + thoiGianCheckIn +
                ", thoiGianCheckOut=" + thoiGianCheckOut +
                ", status=" + status +
                '}';
    }
    public void inThongTinNhanVien() {
        String name1 = gioiTinh == 1 ? "nam" : gioiTinh == 0 ? "nu" : "be de";
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Tên: " +tenNhanVien + "- Mã sinh viên: " + maNhanVien +"-Tuổi :"+tuoinv+"-Quê quán "+quequan+ "-Giới tính : " + gioiTinh + "- Thời gian check in: " + thoiGianCheckIn +"-Thời gian check out:"+thoiGianCheckOut );
    }
}
