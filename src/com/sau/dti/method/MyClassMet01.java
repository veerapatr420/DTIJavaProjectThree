package com.sau.dti.method;

public class MyClassMet01 {
    //method คือ function คือ การทำงานหนึ่งๆ ที่จะไม่ทำงานหากไม่ call method
    public static void showHi() {
        System.out.println("Hi..");
    }
    public static void showHello() {
        System.out.println("Hi..");
    }
    public static void showHey() {
        System.out.println("Hey..");
    }
    public static void main(String[] args) {
        showHi();
        showHello();
        showHey();
    }
}
