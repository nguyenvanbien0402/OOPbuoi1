import java.util.Scanner;
public class HinhChuNhat {

    public double chieuDai;
    public  double chieuRong;

    // phuong thuc khoi tao

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {}


    // phuong thuc get va set


    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

// phuong thuc nhap xuat
    public void input() {
        Scanner phim = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        chieuDai = phim.nextDouble();
        System.out.println("nhap chieu rong");
        chieuRong = phim.nextDouble();
    }

    // phuong thuc tinh chu vi

    public void TinhChuvi() {
        double chuVi = (chieuDai+chieuRong)*2;
        System.out.println("chu vi của hình chữ nhật là  : " + chuVi);
    }

    public void TinhDienTich() {
        Double dienTich = chieuDai*chieuRong;
        System.out.println("diện tích của hình chữ nhật là:" + dienTich);
    }
}
