package hinhhoc;

public class tugiac {
    public String TenHinh;
    public TuGiac(){
        TenHinh = "Tu giac";
    }
    public TuGiac(String name){
        TenHinh = name;
    }
    public void HienThi()
    {
        System.out.println("Ten Hinh = " + TenHinh);
    }
}