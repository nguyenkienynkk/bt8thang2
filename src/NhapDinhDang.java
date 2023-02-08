
import java.util.Scanner;

public class NhapDinhDang {
    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        boolean check = true;

        while (check) {
            System.out.println("1.Nhập vào 5 mã số");
            System.out.println("2.Kiểm tra chuỗi");
            System.out.println("3.Kiểm tra chuỗi phù hợp");
            System.out.println("6.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                 nhapdinhdang();
                    break;
                case 2:
                    kiemtrachuoi();
                    break;
                case 3:
                    kiemtrachuoiphuhop();
                    break;
                case 6:
                    check = false;
                    System.out.println("Thoát chương trình");
                    break;


            }

        }
    }

    private static void kiemtrachuoiphuhop() {
        String chuoi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        chuoi = sc.nextLine();

        if(chuoi.matches("^[A-Z][^\\s]{0,18}\\d$"))
            System.out.println("Duyệt");
        else
            System.out.println("Không duyệt");
    }

    private static void kiemtrachuoi() {
        String chuoi;
        char kiTu;
        boolean giatriTontai = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        chuoi = sc.nextLine();
        System.out.println("Nhập vào ký tự muốn kiểm tra:");
        kiTu = sc.nextLine().charAt(0);

        char mangKiTu[] = chuoi.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++)
        {
            if (kiTu == mangKiTu[i])
            {
                System.out.println((i+1));
                giatriTontai = true;
            }
        }
        if(giatriTontai == false)
            System.out.println("Không tồn tại trong chuỗi");
    }

    private static void nhapdinhdang() {
                String dinhdang;
                System.out.println("Nhập vào 5 mã số:");
                Scanner sc = new Scanner(System.in);
                dinhdang = sc.nextLine();
                if (dinhdang.matches("00+[2-5]{1}+L+\\d{4}"))
                    System.out.println("Đúng rồi");
                else
                    System.out.println("Sai rồi");


    }
    


}
