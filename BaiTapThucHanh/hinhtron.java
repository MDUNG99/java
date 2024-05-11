package hinhhoc ;

import java.util.Scanner;

public class hinhtron extends hinhhoc {

    public float bankinh;

    public hinhtron() {
        ten = " hinh tron ";
    }

    public void nhapbankinh() {
        System.out.println("ban kinh= ");
        Scanner sc =new Scanner(System.in);
        bankinh = sc.nextInt();
    }
    public void tinhchuvi () {
        chuvi = 2 *PI *bankinh ;
    }
    public void tinhdientich () {
        dientich = PI * bankinh * bankinh ;
    }

}