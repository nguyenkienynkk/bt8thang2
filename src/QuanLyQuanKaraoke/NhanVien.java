package QuanLyQuanKaraoke;

public class NhanVien {
    private String tenNV;
    private int tuoiNV;
    private String maNhanVien;

    private int chucVu;
    private int caLam;


    public NhanVien(String teen, int tuii, String manv, int chucvu) {
        this.tenNV = teen;
        this.tuoiNV = tuii;
        this.maNhanVien = manv;
        this.chucVu = chucvu;

    }

    public NhanVien( int ca) {
        this.caLam = ca;
    }


    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public int getCaLam() {
        return caLam;
    }

    public void setCaLam(int caLam) {
        this.caLam = caLam;
    }


    public String getTenNV() {
        return tenNV;
    }


    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoiNV() {
        return tuoiNV;
    }

    public void setTuoiNV(int tuoiNV) {
        this.tuoiNV = tuoiNV;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "tenNV='" + tenNV + '\'' +
                ", tuoiNV=" + tuoiNV +
                ", maNhanVien='" + maNhanVien + '\'' +
                ", chucVu=" + chucVu +
                ", caLam=" + caLam +
                '}';
    }
}
