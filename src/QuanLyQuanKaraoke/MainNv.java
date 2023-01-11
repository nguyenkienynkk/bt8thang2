package QuanLyQuanKaraoke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainNv {


    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static List<NhanVien> danhSachNhanVien = new ArrayList<>();
    public static List<PhongKaraoke> danhSachPhong = new ArrayList<>();

    public static void menu() {
        boolean check = true;

        while (check) {
            System.out.println("________Quản Lý Quán Karaoke_________");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.In danh sách nhân viên");
            System.out.println("3.Phân ca làm cho nhân viên");
            System.out.println("4.Tìm kiếm nhân viên theo tên");
            System.out.println("------------Thêm phòng hát cho khách----------");
            System.out.println("5.Thêm phòng ");
            System.out.println("6.Mời bạn chọn phòng cho khách ");
            System.out.println("7.Tính tiền cho khách");
            System.out.println("8.Sắp xếp hóa đơn theo giá tiền");
            System.out.println("9.Thống kê số tiền 1 ngày");
            System.out.println("10.Exit");
            System.out.println("Anh chạy code thì chạy thêm nguoi chức vụ cho là quản l hết nha anh. em code lỗi phần đó mà kh sửa dc lần sau em sẽ rút kinh nghiệm ạ");

            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    themNhanVienMoi(danhSachNhanVien);
                    break;
                case 2:
                    inThongTinNhanVien(danhSachNhanVien);
                    break;
                case 3:
                    phanCaChoNhanVien(danhSachNhanVien);
                    break;
                case 4:
                    timKiemNhanVienTheoTen(danhSachNhanVien);
                    break;
                case 5:
                    themPhong(danhSachPhong);
                    break;
                case 6:
                    chonPhongChoKhach(danhSachPhong);
                    break;
                case 7:
                    tinhTienChoKhach(danhSachPhong);
                    break;
                case 8:
                    sxHoaDonTheoGiaTien(danhSachPhong);
                    break;
                case 9:
                    thongKeSoTien1Ngay(danhSachPhong);
                    break;
                case 10:
                    check = false;
                    System.out.println("Thoát chương trình");
                    break;


            }

        }
    }

    private static void thongKeSoTien1Ngay(List<PhongKaraoke> danhSachPhong) {
        System.out.println("Tổng tiền của cả ngày là:");
        double tongtienn = 0;
        System.out.println("Tổng của tất cả các cái tính tiền cho khách mà em tính phần tính tiền nma em kh bt cách cộng");
    }

    private static void tinhTienChoKhach(List<PhongKaraoke> danhSachPhong) {
        double tongtien = 0;
        for (int i = 0; i < danhSachPhong.size(); i++) {
           tongtien = (danhSachPhong.get(i).getGioKetThuc()-danhSachPhong.get(i).getGioBatDau())*200;
            System.out.println("Tổng tiền của quý khách phòng"+danhSachPhong.get(i).getTenPhong()+"là" + tongtien + "nghìn đồng");
        }

    }

    private static void sxHoaDonTheoGiaTien(List<PhongKaraoke> danhSachPhong) {

    }

    private static void chonPhongChoKhach(List<PhongKaraoke> danhSachPhong) {
            System.out.println("Mời bạn nhập tên khách hàng muốn đăng ký phòng là:" );
            String tenk = scanner.nextLine();
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getTenNV().equals(tenk)){
                System.out.println(danhSachPhong.get(i).getTenPhong());
                System.out.println("Mời bạn nhập tên phòng muốn đăng ký :");
                String tenp =scanner.nextLine();
                if (danhSachPhong.get(i).getTenPhong().equals(tenp)){
                    System.out.println("Bạn đã đăng ký thành công");
                  danhSachPhong.get(i).setTenPhong(tenp);
                  danhSachPhong.get(i).setTenPhong(tenk);
                }
            }
        }


    }

    private static void themPhong(List<PhongKaraoke> danhSachPhong) {
        System.out.println("Mời bạn nhập vào số lượng phòng muốn thêm:");
        int soluong = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < soluong; i++) {
            System.out.println("Mời bạn nhập tên phòng thứ " + (i + 1));
            String tennn = scanner.nextLine();
            System.out.println("Mời bạn nhập mã của phòng thứ" + (i + 1));
            String map = scanner.nextLine();
            System.out.println("Mời bạn nhập giờ bắt đầu của phòng thứ"+(i+1));
            int giobd =Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập giờ kết thúc của phòng thứ"+(i+1));
            int giokt =Integer.parseInt(scanner.nextLine());
                danhSachPhong.add(new PhongKaraoke(tennn,map,giobd,giokt));
            }
        }

    private static void timKiemNhanVienTheoTen(List<NhanVien> danhSachNhanVien) {
        System.out.println("Mời bạn nhập tên nhân viên là:");
        String tenn =scanner.nextLine();
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getTenNV().equals(tenn)){
                System.out.println(danhSachNhanVien.get(i).toString());
            }
        }
    }

    private static void phanCaChoNhanVien(List<NhanVien> danhSachNhanVien) {
        System.out.println("Mời bạn nhập chức vụ là:");
        int sohai =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if(sohai == danhSachNhanVien.get(i).getChucVu()){
                System.out.println("Bạn là quản lý mời bạn nhập mã quản lý:");
             String maql = scanner.nextLine();
                for (int j = 0; j < danhSachNhanVien.size(); j++) {
                   if (danhSachNhanVien.get(i).getMaNhanVien().equals(maql)){
                       System.out.println("Mời bạn nhập tên nhân viên muốn thêm ca:");
                       for (int s = 0; s < danhSachNhanVien.size(); s++) {
                           System.out.println(danhSachNhanVien.get(i).getTenNV());
                       }
                       String tennnv =scanner.nextLine();
                       if (danhSachNhanVien.get(i).getTenNV().equals(tennnv)){
                           System.out.println("Mời bạn chọn ca nhân viên muốn làm:");
                           System.out.println("Ca từ 1 đến 6");
                         int cala= Integer.parseInt(scanner.nextLine());
                         if (cala>6 || cala <1){
                             System.out.println("Ca này không tồn tại");
                         }else{
                          danhSachNhanVien.get(i).setCaLam(cala);
                         }

                       }


                   }
                }
            }
        }
    }



    private static void inThongTinNhanVien(List<NhanVien> danhSachNhanVien) {
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            System.out.println(danhSachNhanVien.get(i).toString());
        }
    }

    private static void themNhanVienMoi(List<NhanVien> danhSachNhanVien) {
        System.out.println("Mời bạn nhập vào số lượng người muốn thêm:");
        int slp = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < slp; i++) {
            System.out.println("Mời bạn nhập tên người thứ " + (i + 1));
            String teen = scanner.nextLine();
            System.out.println("Mời bạn nhập tuổi của người thứ:" + (i + 1));
            int tuii = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập chức vụ của người thứ:" + (i + 1));
            System.out.println("1.Nhân Viên");
            System.out.println("2.Quản Lý");
            System.out.println("3.Khách Hàng");
            int chucvu = Integer.parseInt(scanner.nextLine());
            if (chucvu == 1 || chucvu == 2 ) {
                System.out.println("Mời bạn nhập mã của người thứ" + (i + 1));
                String manv = scanner.nextLine();
                danhSachNhanVien.add(new NhanVien(teen, tuii, manv, chucvu));
            }
        }

    }
    }



