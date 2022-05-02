package OOP;

import java.util.Scanner;

public class HinhThoi {
    public int n;
    public void HinhThoi(){}
    public void HinhThoi(int n){
        this.n = n;
    }
    public void NhapHinhThoi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap chieu cao cua hinh: ");
        this.n = sc.nextInt();
    }
    public void XuatHinhThoi(){
        for(int i=1;i<=this.n;i++){
            for(int j=1;j<=this.n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=this.n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
