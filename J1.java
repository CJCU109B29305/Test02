import java.util.*;

import javax.management.RuntimeErrorException;
public class J1 {
    public static void main(String[]argv){
        System.out.println("密碼輸入測試");
        int A;
        int B;
        int C;
        int D;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("請輸入密碼:");
            A = sc.nextInt();
            System.out.print("請再輸入一次密碼:");
            B = sc.nextInt();
            if (A == B){
                System.out.println("密碼正確");
            }
            else{
                System.out.println("與第一次輸入的密碼不同!");
                System.out.print("請再輸入一次密碼:");
                C = sc.nextInt();
                if (A == C){
                    System.out.println("密碼正確");
                }
                else{
                    System.out.println("與第一次輸入的密碼不同!");
                    System.out.print("請再輸入一次密碼:");
                    D = sc.nextInt();
                    if (A == D){
                        System.out.println("密碼正確");
                    }
                    else{
                        System.out.println("與第一次輸入的密碼不同!"); 
                        throw new RuntimeException("輸入三次錯誤!程式終止!"); 
                    }
                }
            }
        }
        catch(RuntimeErrorException e){
        }
    }
}
