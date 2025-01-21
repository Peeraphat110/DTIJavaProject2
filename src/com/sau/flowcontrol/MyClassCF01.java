package com.sau.flowcontrol;

public class MyClassCF01 {
    //Control Flow/Control Statement
    //กลุ่มที่ 1 Selection/Condition (if, if-else, if-else,if, swich case
    public static void main(String[] args) {
        //พิสูทย์ครั้งเดียวจริงทำ เท็จไม่ทำ : if
        int a = 50;
        if( a > 35 ){
            System.out.println("Hello...");
        }
        System.out.println("----------------");
        //พิสูทย์ครั้งเดียวจริงทำ เท็จก็ทำ : if-else
        String b = "SAU";
        if( b.equals("SAU")){
            System.out.println("sout is asia");
        }else{
            System.out.println("NO no no!!!");
        }
        System.out.println("----------------");
    }
}
