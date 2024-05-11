package Kethua;

public class mainkethua {
    public static void main(String[] args) throws Exception {
 
        HinhTron hinhtron = new HinhTron();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inChuVi();
        hinhtron.inDienTich();
   
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuVi();
        hinhchunhat.inDienTich();
  
        HinhTruTron hinhtrutron = new HinhTruTron();
        hinhtrutron.nhapChieuCao();
        hinhtrutron.tinhTheTich() ;
        hinhtrutron.inTheTich();
        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();
    }
}