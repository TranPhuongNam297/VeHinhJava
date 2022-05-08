package OOP;

import java.util.Scanner;

public class HinhVuong {
    public int canh;
    public void HinhVuong(){}
    public void HinhVuong(int canh){
        this.canh = canh;
    }
    public void NhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap canh cua hinh: ");
        this.canh = sc.nextInt();
    }
    public void XuatHinhVuong (){
        for (int i = 1; i < this.canh; i++){
            for (int j = 1; j < this.canh; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
