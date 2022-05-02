package OOP;

import java.util.Scanner;

public class TamGiac {
    public int h;
    public void TamGiac(){}
    public void TamGiac(int h){
        this.h = h;
    }
    public void Nhap (){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Hay nhap do cao cua hinh: ");
        this.h = sc.nextInt();
    }
    public void Output(){
        for(int i=1; i<=this.h; i++)
        {
            for(int j=0; j<this.h-i; j++)
                System.out.print(" ");
            for(int j=0; j<(2*i-1); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
