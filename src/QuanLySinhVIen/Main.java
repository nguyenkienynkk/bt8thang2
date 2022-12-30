package QuanLySinhVIen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static List<SinhVien> danhSachSinhVien = new ArrayList<>();
    public static List<MonHoc> danhSachMonHoc = new ArrayList<>();


    public static void menu() {
        boolean check = true;

        while (check) {
            System.out.println("________Quản Lý Sinh Viên_________");
            System.out.println("1.Thêm sinh viên");
            System.out.println("2.In danh sách sinh viên");
            System.out.println("------------Thêm môn học cho sinh viên----------");
            System.out.println("3.Thêm môn học");
            System.out.println("4.Đăng ký môn học cho sinh viên");
            System.out.println("5.Tìm kiếm sinh viên theo mã sinh viên, thống kê sinh viên đó học bao nhiêu môn và điểm trung bình môn nào là cao nhất");
            System.out.println("6.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    themSinhVienMoi(danhSachSinhVien);
                    break;
                case 2:
                    inThongTinSinhVIen(danhSachSinhVien);
                    break;
                case 3:
                    themMonHoc(danhSachMonHoc);
                    break;
                case 4:
                    themMonHocChoSinhVien(danhSachMonHoc);
                    break;
                case 5:
                    timKiemSinhVienTheoMaSinhVien(danhSachSinhVien);
                    break;
                case 6:
                    check = false;
                    System.out.println("Thoát chương trình");
                    break;


            }

        }
    }



    private static void timKiemSinhVienTheoMaSinhVien(List<SinhVien> danhSachSinhVien) {
        System.out.println("Mời bạn nhập mã sinh viên cần tìm:");
        String maa = scanner.nextLine();
        System.out.println("Thông tin bạn cần tìm :");
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMaSv().equals(maa)) {
                danhSachSinhVien.get(i).inThongTinSinhVien();
            }
        }
        for (int i = 0; i <danhSachMonHoc.size(); i++) {

            if (danhSachMonHoc.get(i).getDiem1() >= danhSachMonHoc.get(i).getDiem2() && danhSachMonHoc.get(i).getDiem1() >= danhSachMonHoc.get(i).getDiem3())
                System.out.println(danhSachMonHoc.get(i).getDiem1() + " là điểm lớn nhất môn"+ danhSachMonHoc.get(i).getTenMon());

            else if (danhSachMonHoc.get(i).getDiem2() >= danhSachMonHoc.get(i).getDiem1()  && danhSachMonHoc.get(i).getDiem2() >= danhSachMonHoc.get(i).getDiem3())
                System.out.println(danhSachMonHoc.get(i).getDiem2() + " là điểm lớn nhất môn"+danhSachMonHoc.get(i).getTenMon());
            else
                System.out.println(danhSachMonHoc.get(i).getDiem3() + " là điểm lớn nhất môn"+danhSachMonHoc.get(i).getTenMon());

        }
        System.out.println("Danh sách các môn đăng ký là:");
        for (int i = 0; i < danhSachMonHoc.size(); i++) {
            System.out.println(danhSachMonHoc.get(i).getTenMon());
        }
    }

    private static void themMonHocChoSinhVien(List<MonHoc> danhSachMonHoc) {
        System.out.println("Mời bạn nhập mã sinh viên :");
        String masvv = scanner.nextLine();
        System.out.println("Mời bạn nhập môn bạn cần đăng ký");

        for (int i = 0; i < danhSachMonHoc.size(); i++) {
            System.out.println(danhSachMonHoc.get(i).getTenMon());
        }
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMaSv().equals(masvv)) {
                System.out.println();
            }
        }
        System.out.println("Đăng ký thành công");
        String slp = scanner.nextLine();
        for (int i = 0; i < danhSachMonHoc.size(); i++) {
            if (danhSachMonHoc.get(i).getTenMon().equals(slp)) {
                danhSachMonHoc.get(i).inThongTinMonHoc();
            }
        }


    }

    private static void inThongTinSinhVIen(List<SinhVien> danhSachSinhVien) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            danhSachSinhVien.get(i).inThongTinSinhVien();
        }
    }
    private static void themSinhVienMoi(List<SinhVien> danhSachSinhVien) {
        System.out.println("Mời bạn nhập vào số lượng sinh viên muốn thêm:");
        int slp = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < slp; i++) {
            System.out.println("Mời bạn nhập tên sinh viên thứ " + (i + 1));
            String teeen = scanner.nextLine();
            System.out.println("Mời bạn nhập mã sinh viên của sinh viên thứ:" + (i + 1));
            String maxxx =scanner.nextLine();
            System.out.println("Mời bạn nhập giới tính của sinh viên thứ " + (i + 1));
            int sexx = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập điểm trung bình của sinh viên thứ" + (i + 1));
            double dtb = Double.parseDouble(scanner.nextLine());

            danhSachSinhVien.add(new SinhVien(teeen,maxxx,sexx,dtb));
        }
    }
    private static void themMonHoc(List<MonHoc> danhSachMonHoc) {
        System.out.println("Mời bạn nhập vào số lượng môn học muốn thêm:");
        int slm = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < slm; i++) {
            System.out.println("Mời bạn nhập tên môn học thứ " + (i + 1));
            String teenm = scanner.nextLine();
            System.out.println("Mời bạn nhập mã môn học thứ:" + (i + 1));
            String max =scanner.nextLine();
            System.out.println("Mời bạn nhập số lượng sinh viên của môn học thứ " + (i + 1));
            int soluong = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập ngày bắt đầu của môn học(ngày tháng:0803) thứ" + (i + 1));
            int ngaybd = Integer.parseInt(scanner.nextLine());
            if (ngaybd>2011){
                System.out.println("Đã quá thời hạn sinh viên không thể đăng ký!!");
            }
            System.out.println("Mời bạn nhập điểm môn thứ nhất là:");
            double diem1 =Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập điểm môn thứ hai là:");
            double diem2 =Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập điểm môn thứ ba là:");
            double diem3 =Double.parseDouble(scanner.nextLine());
            if (diem1<0||diem1>10&&diem2<0||diem2>10&&diem3<0||diem3>10){
                System.out.println("Điểm không thể nhỏ hơn 0 hoặcgit vượt quá 10");
            }
            danhSachMonHoc.add(new MonHoc(teenm,max,soluong,ngaybd,diem1,diem2,diem3));
        }
    }


}
