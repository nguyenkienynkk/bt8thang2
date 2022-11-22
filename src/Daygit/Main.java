package Daygit;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    Integer[] arr = { 1, 43, 65, 3, -10, 23, 45, 6, 5, 4, 99, 14, 97 };
    private static Integer[] ListSo;

    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean check = true;

        while (check) {
            System.out.println("________Bài tập_________");
            System.out.println("1.Tính tổng các dãy số trên");
            System.out.println("2.Tìm kiếm tất cả số lớn hơn 35");
            System.out.println("3.Sắp xếp các số trên theo thứ tự giảm dần");
            System.out.println("4.Tìm tất cả các cặp số có tổng chia hết cho 10");
            System.out.println("5.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so){
                case 1:
                    tongDaySoTren();

                    break;
                case 2:
                    timKiemCacSoLonHon35();
                    break;
                case 3:
                    sXGiamDan();
                    break;
                case 4:
                    timCacCapSoChiaHetCho10();
                    break;
                case 5:
                    check = false;
                    System.out.println("Exit");
                    break;



            }

        }
    }
    private static void sXGiamDan() {
        int []array = {1, 43, 65, 3, -10, 23, 45, 6, 4, 99};
        List<Integer> giatri2 = new ArrayList<>();

        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j >= 1; j--) {
                int tempSort = 0;
                if (array[j] < array[j - 1]) {
                    tempSort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempSort;
                }
            }
        }

        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    private static void timCacCapSoChiaHetCho10() {
//        int []array = {1, 43, 65, 3, -10, 23, 45, 6, 4, 99};
//        List<Integer> giatri1 = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 10 == 0) {
//                System.out.print(array[i] + "\t");
//            }
//        }
//        System.out.println("Các cặp số chia hết cho 10 là: ");
//        for (int i = 0; i <= array.length; i++) {
//
//        }
    }
    private static void timKiemCacSoLonHon35() {
        int []array = {1, 43, 65, 3, -10, 23, 45, 6, 4, 99};
        List<Integer> giatri = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]>35){
                giatri.add(array[i]);
            }
        }
        System.out.println("Các số lớn hơn 35"+giatri);

    }

    public static void tongDaySoTren(){
        int[] array = {1, 43, 65, 3, -10, 23, 45, 6, 4, 99};
        int max = array[0];
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        out.println("Tổng các chữ số trong list trên là:" + sum);
    }

}
