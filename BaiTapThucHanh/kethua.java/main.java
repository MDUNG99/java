package KeThua_Person;

public class main {
    public static void main(String[] args) throws Exception{
        // Person
        Person p = new Person();
        p.nhapGiaTri();
        p.inGiaTri();
        // Employer
        Employer e = new Employer();
        e.nhapGiaTriEmployer();
        e.inGiaTriEmployer();
        // Full Time
        FullTime ft = new FullTime();
        ft.nhapSoNgayNghi();
        ft.tinhTienHoaHong();
        ft.tinhLuongFullTime();
        ft.intinhLuongFullTime();
        // Part Time 
        PartTime pt = new PartTime();
        pt.nhapSoGioDiLam();
        pt.tinhLuongGioLam();
        pt.intinhLuongPartTime();
    }
}