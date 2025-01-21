package com.sau.flowcontrol;

public class MyClassCF02 {
    public static void main(String[] args) {
        //พิสูจน์หลายครั้ง : if-else=if, switch=case
        //switch=case ใฃ้ได้เฉพาะพิสูจน์ ตัวเลข ตัวอักษร และเท่ากันหรือไม่เท่ากัน
        int score = 75;
        if( score > 80){
            System.out.println("Grade A");
        }else if(score > 70){
            System.out.println("Grade B");
        }else if(score > 60){
            System.out.println("Grade C");
        }else if(score > 50) {
            System.out.println("Grade D");
        }else { // ไม่จำเป็นต้องมี if
            System.out.println("Grade F");
        }
        System.out.println("----------------");
        //switch-case ใฃ้ได้เฉพาะพิสูจน์เท่ากันหรือไม่เท่ากันเท่านั้น
        int busNumber = 84;

        switch(busNumber){
            case 80 :
                System.out.println("Go to PATA");
                break;
            case 81 :
                System.out.println("Go to siriraj");
                break;
            case 84 :
                System.out.println("Go to wat rai kring");
                break;
            case 123 :
                System.out.println("Go to central pinklo");
                break;
            default:
                System.out.println("Do not have DATA T-T");
        }


    }
}
