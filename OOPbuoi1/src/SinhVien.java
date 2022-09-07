import java.util.Scanner;
public class SinhVien {

    private String ten;
    private String ma;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private String  xepLoai;

    public SinhVien(String ten, String ma, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.ma = ma;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;

    }

    public SinhVien() {
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

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    // phuong thuc nhap

    public void input() {
        Scanner phim = new Scanner(System.in);
        System.out.println("nhap ten");
        ten = phim.nextLine();
        System.out.println("nhap ma");
        ma = phim.nextLine();
        System.out.println("nhap diem toan");
        diemToan = phim.nextDouble();
        System.out.println("nhap ly");
        diemLy = phim.nextDouble();
        System.out.println("nhap hoa");
        diemHoa = phim.nextDouble();
    }
    // phuong thuc tinh diem trung binh

    public double TinhDiemTrungBinh() {
        double dtb = (diemHoa + diemLy + diemToan) / 3;
        return dtb;
    }

    // phuong thuc phan loai

    public String PhanLoai() {
        double dtb = TinhDiemTrungBinh();

        if (dtb >= 9) {
            xepLoai = "xuất xắc";
        } else if (dtb >= 8 && dtb < 9) {
            xepLoai = "giỏi";
        } else if (dtb >= 7 && dtb < 8) {
            xepLoai = "kha";
        } else if (dtb >= 6 && dtb < 7) {
            xepLoai = " trung bình khá";
        } else if (dtb >= 5 && dtb < 6) {
            xepLoai = "trung bình";
        } else {
            xepLoai = "yếu";
        }
    System.out.println("hoc luc cua sinh vien la :"  + xepLoai);
        return xepLoai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", ma='" + ma + '\'' +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                ", xepLoai='" + xepLoai + '\'' +
                '}';
    }
}

