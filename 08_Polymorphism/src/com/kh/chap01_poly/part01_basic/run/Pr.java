package com.kh.chap01_poly.part01_basic.run;
/*
class Parents {
	public String x() {
		return "A.x";
	}
}

class Child1 extends Parents {
	public String x() {
		return "B.x";
	}

	public String y() {
		return "y";
	}
}

public class Pr {
	public static void main(String[] args) {
		Parents obj = new Child1();
		System.out.println(obj.x());
	}
}
*/

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class Pr {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}