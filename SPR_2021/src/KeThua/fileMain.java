/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThua;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class fileMain {
    public static void main(String[] args) {
       NhanVien nv = new NhanVien("1", "Minh", 9900000);
       nv.xuatThongTin();
       
       TruongPhong tp = new TruongPhong(300000, "12", "Thái", 12000000);
       tp.xuatThongTin();
       
        
//        String user = "Minh";
//        String pass = "java";
//        
//        System.out.print("Mời nhập user: ");
//        String userName = sc.nextLine();
//        System.out.print("Mời nhập password: ");
//        String passWord = sc.nextLine();
//        
//        if(user.equalsIgnoreCase(userName)&&
//                pass.equals(passWord)){
//            nv.menu();
//        }else{
//            System.out.println("Sai rồi thánh ơi!");
//        }
    }
}
