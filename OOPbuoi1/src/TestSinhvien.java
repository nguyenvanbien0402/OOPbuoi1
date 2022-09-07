import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TestSinhvien {
     static  List<SinhVien>  listSinhVien = new ArrayList<SinhVien>(3);

    public static  void main(String [] args) {


        for(int i =0; i<3; i++) {
            System.out.println("sinh vien thứ: " + (i+1));
            SinhVien sv = new SinhVien();
            listSinhVien.add(sv);
            sv.input();
             double dtb = sv.TinhDiemTrungBinh();
             System.out.println("diem trung binh :" + dtb);
            sv.PhanLoai();
        }
        for (SinhVien sv: listSinhVien
             ) {
            System.out.println(sv.toString());
        }
    }
}
