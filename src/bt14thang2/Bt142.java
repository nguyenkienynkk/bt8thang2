package bt14thang2;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bt142 {
        public static void main(String[] args) {
            menu();
        }
    public static List<NhanVien1> danhSachNhanVien1 = new ArrayList<>();
        public static Scanner scanner = new Scanner(System.in);
        public static void menu() {
            boolean check = true;

            while (check) {
                System.out.println("-----Chấm công nhân viên-----");
                System.out.println("1.Thêm nhân viên");
                System.out.println("2.Hiển thị thông tin");
                System.out.println("3.Check in");
                System.out.println("4.Check out");
                System.out.println("5.Show thời gian làm việc");
                System.out.println("6.Exit");
                int so = Integer.parseInt(scanner.nextLine());
                switch (so) {
                    case 1:
                      themNhanVien(danhSachNhanVien1);
                        break;
                    case 2:
                        hienThiThongTin(danhSachNhanVien1);
                        break;
                    case 3:
                        checkIn(danhSachNhanVien1);
                        break;
                    case 4:
                        checkOut(danhSachNhanVien1);
                        break;
                    case 5:
                        showThoiGianLamViec(danhSachNhanVien1);
                        break;
                    case 6:
                        check = false;
                        System.out.println("Thoát chương trình");
                        break;


                }

            }
        }

    private static void showThoiGianLamViec(List<NhanVien1> danhSachNhanVien1) {
        for (int i = 0; i < danhSachNhanVien1.size(); i++) {
            ZonedDateTime zdt = ZonedDateTime.of(danhSachNhanVien1.get(i).getThoiGianCheckIn(), ZoneId.systemDefault());
            ZonedDateTime zdt2 = ZonedDateTime.of(danhSachNhanVien1.get(i).getThoiGianCheckOut(), ZoneId.systemDefault());
            long date1 = zdt.toInstant().toEpochMilli();
            long date2 = zdt2.toInstant().toEpochMilli();
            System.out.println(((date2 - date1)/1000)-20);
            if (date2-date1>=180){
                System.out.println("Nhân viên này làm đủ tiêu chuẩn");
            }else {
                System.out.println("Nhân viên này đã làm thiếu" + (200-((date2 - date1)/1000)-20) + "giây");
                System.out.println("Không đạt yêu cầu");
            }
        }
    }

    private static void checkOut(List<NhanVien1> danhSachNhanVien1) {
        System.out.println("Mời bạn nhập mã nhân viên :");
        String ma = scanner.nextLine();
        for (int i = 0; i < danhSachNhanVien1.size(); i++) {
            if (danhSachNhanVien1.get(i).getMaNhanVien().equals(ma)) {
                System.out.println("Đã check out");
                LocalDateTime dateNow = LocalDateTime.now();
                danhSachNhanVien1.get(i).setThoiGianCheckOut(dateNow);
                danhSachNhanVien1.get(i).setStatus(2);
            }

        }
    }

    private static void checkIn(List<NhanVien1> danhSachNhanVien1) {
        System.out.println("Mời bạn nhập mã nhân viên :");
        String masvv = scanner.nextLine();
        for (int i = 0; i < danhSachNhanVien1.size(); i++) {
            if (danhSachNhanVien1.get(i).getMaNhanVien().equals(masvv)) {
                System.out.println("Đã check in");
                LocalDateTime dateNow = LocalDateTime.now();
                danhSachNhanVien1.get(i).setThoiGianCheckIn(dateNow);
                danhSachNhanVien1.get(i).setStatus(1);
            }

        }

    }

    private static void hienThiThongTin(List<NhanVien1> danhSachNhanVien1) {
        for (int i = 0; i < danhSachNhanVien1.size(); i++) {
            danhSachNhanVien1.get(i).inThongTinNhanVien();
        }
    }

    private static void themNhanVien(List<NhanVien1> danhSachNhanVien1) {

            System.out.println("Mời bạn nhập vào số lượng nhân viên muốn thêm:");
            int slp = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < slp; i++) {
                System.out.println("Mời bạn nhập tên nhân viên thứ " + (i + 1));
                String teeen = scanner.nextLine();
                System.out.println("Mời bạn nhập mã nhân viên của nhân viên thứ:" + (i + 1));
                String maxxx =scanner.nextLine();
                System.out.println("Mời bạn nhập tuổi của nhân viên thứ " + (i + 1));
                int tuoii = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập quê quán của nhân viên thứ" + (i + 1));
                 String quequan =scanner.nextLine();
                System.out.println("Mời bạn nhập giới tính của nhân viên thứ "+(i+1));
                int  sexx = Integer.parseInt(scanner.nextLine());

              danhSachNhanVien1.add(new NhanVien1(teeen,maxxx,tuoii,quequan,sexx));
            }

    }


}
