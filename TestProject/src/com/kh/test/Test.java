package com.kh.test;

class Parents{
    public String x(){return "A.x";}
}
class Child1 extends Parents{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class Child2 extends Parents{
    public String x(){return "B2.x";}
}

public class Test {
    public static void main(String[] args) {
    	Parents obj = new Child1();
    	Parents obj2 = new Child2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}
