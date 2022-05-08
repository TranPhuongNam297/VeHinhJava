import java.util.Scanner;

import OOP.HinhChuNhat;
import OOP.HinhThoi;
import OOP.HinhVuong;
import OOP.TamGiac;

public class App {
    public static void main(String[] args){
        TamGiac tg = new TamGiac();
        HinhVuong hv = new HinhVuong();
        HinhChuNhat hcn = new HinhChuNhat();
        HinhThoi ht = new HinhThoi();
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap hinh ban muon ve: ");
        n = sc.nextLine();
        if (n.equals("Tam Giac")){
            tg.Nhap();
            tg.Output();
        }
        if(n.equals("Hinh Vuong")){
            hv.NhapCanh();
            hv.XuatHinhVuong();
        }
        if(n.equals("Hinh Chu Nhat")){
            hcn.NhapHinhChuNhat();
            hcn.XuatHinhChuNhat();
        }
        if(n.equals("Hinh Thoi")){
            ht.NhapHinhThoi();
            ht.XuatHinhThoi();
        }
    }
}
