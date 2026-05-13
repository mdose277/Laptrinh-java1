package community.ni;

public class bai3hinhtron extends bai3hinh{
	private double banKinh;

    public bai3hinhtron(String mau, double banKinh) {
        super(mau);
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public String layThongTin() {
        return "Hinh Tron - Mau: " + mau +
                ", Ban kinh: " + banKinh;
	

}
}
