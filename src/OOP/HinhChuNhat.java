package OOP;

import java.util.Scanner;

public class HinhChuNhat {
    public int chieudai;
    public int chieurong;
    public void HinhChuNhat(){}
    public void HinhChuNhat(int chieudai, int chieurong){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public void NhapHinhChuNhat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap chieu dai: ");
        this.chieudai = sc.nextInt();
        System.out.print("Hay nhap chieu rong: ");
        this.chieurong = sc.nextInt();
    }
    public void XuatHinhChuNhat(){
        for(int i = 0; i < this.chieudai; i++) {
            for(int j = 0; j < this.chieurong; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    //thay doi
}
