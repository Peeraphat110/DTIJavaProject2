package workshop;

import java.util.Scanner;

public class SumProject {
    //ป้อนตัวเลข  2 จำนวนทางแป้นพิมพ์ แล้วแสดงผลรวมทางหน้าจอ
    //ทั้งนี้หากผลรวมยังไม่เกิน 500
    //ให้วนป้อนตัวเลข 2 จำนวนทางแป้นพิมพ์ แล้วแสดงผลรวมทางหน้าจอ ไปเรื่อยๆ
    public static void main(String[] args) {
        double sum = 0;

        Scanner sc = new Scanner(System.in);

        while ( sum <= 500) {
            System.out.print("Enter Number 1 : ");
            int num1 = sc.nextInt();

            System.out.print("Enter Number 2 : ");
            int num2 = sc.nextInt();

            sum = num1 + num2;
            System.out.println("Sum: " + sum);

            if(sum > 500){
                break;
            }
        }
    }
}
