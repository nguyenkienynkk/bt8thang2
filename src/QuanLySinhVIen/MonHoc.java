package QuanLySinhVIen;

public class MonHoc {
    //  lớp môn học ( mã môn, tên môn, số lượng học sinh học, ngày bắt đầu).
    private String tenMon;
    private String maMon;
    private int slHocSinh;
    private int ngayBatDau;

    private double diem1;
    private double diem2;
    private double diem3;


    public MonHoc(String tenMon, String maMon, int slHocSinh, int ngayBatDau, double diem1, double diem2, double diem3) {
        this.tenMon = tenMon;
        this.maMon = maMon;
        this.slHocSinh = slHocSinh;
        this.ngayBatDau = ngayBatDau;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getTenMon() {
        return tenMon;
    }



    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getSlHocSinh() {
        return slHocSinh;
    }

    public void setSlHocSinh(int slHocSinh) {
        this.slHocSinh = slHocSinh;
    }

    public int getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(int ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "tenMon='" + tenMon + '\'' +
                ", maMon='" + maMon + '\'' +
                ", slHocSinh=" + slHocSinh +
                ", ngayBatDau=" + ngayBatDau +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 +
                '}';
    }

    public void inThongTinMonHoc() {
        System.out.println("Thông tin môn học: ");
        System.out.println("Tên môn: " + tenMon + "- Mã môn: " + maMon + "-Số lượng sinh viên của lớp : " + slHocSinh + "- Ngày bắt đầu học: " + ngayBatDau +"-Diểm môn 1 là:"+diem1+"Điểm môn 2 là:"+diem2+"Điểm môn 3 là:"+diem3
        );
    }
}
