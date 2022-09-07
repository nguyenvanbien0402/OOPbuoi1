import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TestSinhVienVer2 {

    static List<SinhVien> listSv = new ArrayList<SinhVien>();
    static List<SinhVien> dtbc = new ArrayList<SinhVien>();
    static  List<SinhVien> sinhVienYeu = new ArrayList<SinhVien>();
    // sinh vien co diem trung binh cao nhat
    public static double DiemTBCaonhat() {

        double  max = listSv.get(0).TinhDiemTrungBinh();
        for (int i=0; i<listSv.size(); i++) {
            if(listSv.get(i).TinhDiemTrungBinh()>max) {
                max = listSv.get(i).TinhDiemTrungBinh();
            }
        }


        for (int i = 0; i<listSv.size(); i++) {
            if(listSv.get(i).TinhDiemTrungBinh()== max) {
                dtbc.add(listSv.get(i));
            }
        }
        return max;
    }

    // phuong thuc tim sinh vien yeu

    public static void Timsvyeu () {
        for (int i=0; i<listSv.size(); i++) {
            if(listSv.get(i).PhanLoai().equalsIgnoreCase("yếu")) {
                sinhVienYeu.add(listSv.get(i));
            }
        }
        if(sinhVienYeu.size()>0) {
            System.out.println(sinhVienYeu.toString());
        } else {
            System.out.println("khong co sinh vien yeu");
        }
    }

    // tim sinh vien theo ten
    public static void Timsv () {
        System.out.println("nhap ten can tim kiem");
        Scanner phim = new Scanner(System.in);
        String m = phim.nextLine();
        for (int i =0; i<listSv.size(); i++) {
            if(listSv.get(i).getTen().equalsIgnoreCase(m)){
                System.out.println(listSv.get(i).toString());
            }
        }
    }

    // tim sinh vien theo ma

    public static void Timsvtheoma () {
        System.out.println("nhập mã sinh viên muốn tìm");
        Scanner phim = new Scanner(System.in);
        String n = phim.nextLine();
        for (int i = 0; i<listSv.size(); i++) {
            if(listSv.get(i).getMa().equalsIgnoreCase(n)) {
                System.out.println(listSv.get(i).toString());
            }
        }
    }

    // xoa mot sinh vien theo ma

    public static void Xoa() {
        System.out.println("nhap ma sinh vien muon xoa");
        Scanner phim = new Scanner(System.in);
        String x = phim.nextLine();
        for(int i=0; i<listSv.size(); i++) {
            if(listSv.get(i).getMa().equalsIgnoreCase(x)) {
                listSv.remove(listSv.get(i));
            }
        }
    }
    public static void main (String [] args) {
    Scanner phim = new  Scanner(System.in);
    System.out.println("nhap so sinh vien muon nhap");
    int h = phim.nextInt();
        for(int i = 0; i<h; i++) {
            System.out.println("sinh vien thứ: " + (i+1));
            SinhVien sv = new SinhVien();
            listSv.add(sv);
            sv.input();
            double dtb = sv.TinhDiemTrungBinh();
            System.out.println("diem trung binh :" + dtb);
        }
        // in ra danh sach sinh vien
        System.out.println("danh sach sinh vien ");
        System.out.println(listSv.toString());

        // in ra danh sach sinh vien co diem cao nhat

        System.out.println(dtbc.toString() + "diem trung binh cao nhat la:" + DiemTBCaonhat());

        // in ra danh sach sinh vien yeu

        Timsvyeu();

        // tim sinh vien theo ten
        Timsv();
        // tim sinh vien theo ma
        Timsvtheoma();
        // xoa mot sinh vien theo ma
        Xoa();
        for (SinhVien sv: listSv
             ) {
            System.out.println(sv.toString());
        }
    }
}
