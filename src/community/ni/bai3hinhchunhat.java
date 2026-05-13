package community.ni;

public class bai3hinhchunhat extends bai3hinh{
	protected double chieuDai;
    protected double chieuRong;

    public bai3hinhchunhat(String mau, double chieuDai, double chieuRong) {
        super(mau);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public String layThongTin() {
        return "Hinh Chu Nhat - Mau: " + mau +
                ", Chieu dai: " + chieuDai +
                ", Chieu rong: " + chieuRong;
    }

}
