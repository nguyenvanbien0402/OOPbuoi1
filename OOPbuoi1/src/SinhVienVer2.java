import java.util.Scanner;

public class SinhVienVer2 {

    private  String ten;
    private String ma;
    private double diemtoan;
    private  double diemly;
    private double diemhoa;
    private String xeploai;
    private double dtb;


    public SinhVienVer2(String ten, String ma, double diemtoan, double diemly, double diemhoa, String xeploai, double dtb) {
        this.ten = ten;
        this.ma = ma;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
        this.xeploai = xeploai;
        this.dtb = dtb;
    }

    public SinhVienVer2() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }

    public double getDiemly() {
        return diemly;
    }

    public void setDiemly(double diemly) {
        this.diemly = diemly;
    }

    public double getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(double diemhoa) {
        this.diemhoa = diemhoa;
    }
    public void setXeploai (String xeploai) {
        this.xeploai = xeploai;

    }

    public String getXeploai() {
        return xeploai;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    // phuong thuc nhap
    public void input() {
        Scanner phim = new Scanner(System.in);
        System.out.println("nhap ten");
        ten = phim.nextLine();
        System.out.println("nhap ma");
        ma = phim.nextLine();
        System.out.println("nhap diem toan");
        diemtoan = phim.nextDouble();
        System.out.println("nhap ly");
        diemly = phim.nextDouble();
        System.out.println("nhap hoa");
        diemhoa = phim.nextDouble();
    }
    // phuong thuc tinh diem trung binh

    public double TinhDiemTrungBinh() {
        double dtb = (diemhoa + diemly + diemtoan) / 3;
        return dtb;
    }

    // phuong thuc phan loai

    public String PhanLoai() {
        double dtb = TinhDiemTrungBinh();

        if (dtb >= 9) {
            xeploai = "xuất xắc";
        } else if (dtb >= 8 && dtb < 9) {
            xeploai = "giỏi";
        } else if (dtb >= 7 && dtb < 8) {
            xeploai = "kha";
        } else if (dtb >= 6 && dtb < 7) {
            xeploai = " trung bình khá";
        } else if (dtb >= 5 && dtb < 6) {
            xeploai = "trung bình";
        } else {
            xeploai = "yếu";
        }
        return xeploai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", ma='" + ma + '\'' +
                ", diemToan=" + diemtoan +
                ", diemLy=" + diemly +
                ", diemHoa=" + diemhoa +
                ", xepLoai='" + xeploai + '\'' +
                ", diem trung binh='" + dtb +
                '}';
    }


}
