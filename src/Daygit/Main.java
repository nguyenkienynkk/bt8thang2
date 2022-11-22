package Daygit;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean check = true;
        List<Otooo> danhSachOto =new ArrayList<>();
        while (check) {
            System.out.println("________Quản Lý Showroom_________");
            System.out.println("1.Thêm xe vào hệ thống quản lý");
            System.out.println("2.Tìm kiếm xe theo tên");
            System.out.println("3.Tìm kiếm theo thương hiệu");
            System.out.println("4.Sắp xếp xe theo giá bán - mã lực - năm sản xuất");
            System.out.println("5. Tìm tất cả xe có màu đen và trước năm 2018");
            System.out.println("6.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so){
                case 1:
                    themXeMoi(danhSachOto);
                    break;
                case 2:
                    timKiemTheoTenXe(danhSachOto); ;
                    break;
                case 3:
                    timKiemTheoThuongHieu(danhSachOto);
                    break;
                case 4:
                    sapXepXeTheoGiaBanMaLucNamsX(danhSachOto);
                    break;
                case 5:
                    timKiemXeMauDensXTruocNam2018(danhSachOto);
                    break;
                case 6:
                    check = false;
                    System.out.println("Exit");
                    break;



            }

        }
    }

    private static void sapXepXeTheoGiaBanMaLucNamsX(List<Otooo> danhSachOto) {
    }
    private static void timKiemXeMauDensXTruocNam2018(List<Otooo> danhSachOto) {
        System.out.println("Nhập chữ den để tìm kiếm các xe màu đen trước năm 2018");

        for (int i = 0; i < danhSachOto.size(); i++) {
            if (danhSachOto.get(i).getYear()<(2018)){
                System.out.println(danhSachOto.get(i).toString());
            }
        }
    }


    private static void timKiemTheoTenXe(List<Otooo> danhSachXe) {
        System.out.println("Nhập tên xe cần tìm:");
        String name1 = scanner.nextLine();
        System.out.println("Xe có tên bạn muốn tìm là:");
        for (int i = 0; i < danhSachXe.size(); i++) {
            if (danhSachXe.get(i).getName().equals(name1)){
                System.out.println(danhSachXe.get(i).toString());
            }
        }

    }



    private static void timKiemTheoThuongHieu(List<Otooo> danhSachThuongHieu) {

        System.out.println("Nhập thương hiệu bạn muốn tìm:");
        String thuonghieu = scanner.nextLine();
        System.out.println("Xe có thương hiệu bạn cần tìm là:");
        for (int i = 0; i < danhSachThuongHieu.size(); i++) {
            if (danhSachThuongHieu.get(i).getTrademark().equals(thuonghieu)){
                System.out.println(danhSachThuongHieu.get(i).getName());
            }
        }
    }


    private static void themXeMoi(List<Otooo> danhSachOto) {
        System.out.println("Mời bạn nhập vào số lượng xe:");
        int slx = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < slx; i++) {
            System.out.println("Mời bạn nhập tên ô tô thứ:");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập màu ô tô thứ "+(i+1));
            String color = scanner.nextLine();
            System.out.println("Mời bạn nhập năm sản xuất của ô tô thứ:"+(i+1));
            int years = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập thương hiệu của ô tô thứ "+(i+1));
            String thuonghieu = scanner.nextLine();
            System.out.println("Mời bạn nhập số mã lực của ô tô thứ:"+(i+1));
            int maluc = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập giá bán của ô tô thứ:"+(i+1));
            int giaban = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập ngày nhập kho của ô tô thứ:"+(i+1));
            int ngaynhapkho = Integer.parseInt(scanner.nextLine());
            danhSachOto.add(new Otooo(name,color,years,thuonghieu,maluc,giaban,ngaynhapkho));
        }
    }

}
