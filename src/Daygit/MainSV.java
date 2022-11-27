package Daygit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainSV {

    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean check = true;
        List<SinhVien2711> danhSachSinhVien =new ArrayList<>();
        while (check) {
            System.out.println("________Quản Lý Sinh Viên_________");
            System.out.println("1.Thêm sinh viên vào hệ thống quản lý");
            System.out.println("2.In danh sách sinh viên ra màn hình");
            System.out.println("3.Kiểm tra danh sách có rỗng hay không");
            System.out.println("4.Lấy ra số lượng sinh viên trong danh sách");
            System.out.println("5. Làm rỗng danh sách sinh viên");
            System.out.println("6.Kiểm tra sinh viên có tồn tại trong danh sách hay không.Dựa vào mã sinh viên");
            System.out.println("7.Xoá 1 sinh viên ra khỏi danh sách ");
            System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên sinh viên được nhập vào bàn phím");
            System.out.println("9. Xuất danh sách sinh viên có điểm từ cao đến thấp");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so){
                case 1:
                    themSinhVienMoi(danhSachSinhVien);
                    break;
                case 2:
                    inSinhVienRaManHinh(danhSachSinhVien); ;
                    break;
                case 3:
                    kiemTraDanhSachRong(danhSachSinhVien);
                    break;
                case 4:
                    laysoLuongSinhVienTrongDanhSach(danhSachSinhVien);
                    break;
                case 5:
                    lamRongDanhSachSV(danhSachSinhVien);
                    break;
                case 6:
                    kiemTraSinhVienCoTonTai0(danhSachSinhVien);
                    break;
                case 7:
                    xoaMotSinhVien(danhSachSinhVien);
                    break;
                case 8:
                    timKiemSVtheoTen(danhSachSinhVien);
                    break;
                case 9:
                    xuatSinhVienTuCaoDenThap(danhSachSinhVien);
                    break;
                case 10:
                    check = false;
                    System.out.println("Thoát chương trình");
                    break;



            }

        }
    }

    private static void kiemTraSinhVienCoTonTai0(List<SinhVien2711> danhSachSinhVien) {
        System.out.println("Nhập mã sinh viên cần kiểm tra tồn tại:");
        int masiv =Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMaSinhVien().equals(masiv)){
                System.out.println("Tồn tại sinh viên");
                check = false;
            }
        }
        if (check){
            System.out.println("Sinh viên không tồn tại");
        }
    }

    private static void lamRongDanhSachSV(List<SinhVien2711> danhSachSinhVien) {
        System.out.println("Xoá hết chọn số 0");
        String xoads =scanner.nextLine();
        if(xoads.equals(0)){
            danhSachSinhVien.clear();
        }
    }

    private static void laysoLuongSinhVienTrongDanhSach(List<SinhVien2711> danhSachSinhVien) {
        System.out.println("Số lượng sinh viên là: " + danhSachSinhVien.size());
    }

    private static void kiemTraDanhSachRong(List<SinhVien2711> danhSachSinhVien) {
        if (danhSachSinhVien.size() == 0){
            System.out.println("Rỗng ");
        }else {
            System.out.println("Không rỗng");
        }
    }

    private static void xuatSinhVienTuCaoDenThap(List<SinhVien2711> danhSachSinhVien) {
        Collections.sort(danhSachSinhVien, ((o1, o2) -> Float.compare((float) o2.getDiemTrungBinh(), (float) o1.getDiemTrungBinh())));
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            System.out.println(danhSachSinhVien.get(i).toString());
        }



    }

    private static void xoaMotSinhVien(List<SinhVien2711> danhSachSinhVien) {
        System.out.println("Nhập tên sinh viên bạn cần xoá");
        String namm =scanner.nextLine();
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            String tensc = danhSachSinhVien.get(i).getHoTen();
            if (tensc.equals(namm)){
                danhSachSinhVien.remove(i);
            }
        }
        System.out.println("Danh sách sinh viên sau xoá là:");
        for (SinhVien2711 sinhVien2711 : danhSachSinhVien) {
            System.out.println(sinhVien2711);
        }
    }

    private static void inSinhVienRaManHinh(List<SinhVien2711> danhSachSinhVien) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            System.out.println(danhSachSinhVien.get(i).toString());
        }
    }

    private static void timKiemSVtheoTen(List<SinhVien2711> danhSachSinhVien) {
        System.out.println("Nhập tên sinh viên cần tìm:");
        String name6 = scanner.nextLine();
        System.out.println("Sinh viên bạn muốn tìm là:");
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getHoTen().equals(name6)){
                System.out.println(danhSachSinhVien.get(i).toString());
            }
        }
    }


    private static void themSinhVienMoi(List<SinhVien2711> danhSachSinhVien) {
        System.out.println("Mời bạn nhập vào số lượng sinh viên:");
        int sls = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sls; i++) {
            System.out.println("Mời bạn nhập tên sinh viên thứ:"+(i+1));
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập mã sinh viên thứ "+(i+1));
            String ma = scanner.nextLine();
            System.out.println("Mời bạn nhập năm sinh của sinh viên thứ:"+(i+1));
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập điểm trung bình của sinh viên thứ "+(i+1));
            double diemtbb = Double.parseDouble(scanner.nextLine());

            danhSachSinhVien.add(new SinhVien2711(name,ma,year,diemtbb));
        }
    }



}
