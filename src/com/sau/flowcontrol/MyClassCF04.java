package com.sau.flowcontrol;

public class MyClassCF04 {
    //คำสั่ง break and continue ใน loop
    // breal ใน Loop ทำงานเมื่อไหร่จบเลย
    //continue ใน Loop ทำงานเมื่อไหร่จบเลยนั้นเลย แล้วไปรอบต่อไปเลย
    public static void main(String[] args) {
        //break
        for( int k = 1 ; k <= 5 ; k++){
            if( k == 3){
                break;
            }
            System.out.println(k + " : Hoo...");
        }
        System.out.println("+++++++++++++=+");
        //continue
        for( int k = 1 ; k <= 5 ; k++){
            if(k == 3){
                continue;
            }
            System.out.println(k + " : Hey...");
        }
    }
}
