package calc;



public class Calc {

Integer add(int a, int b) {
	return a+b;
}

Integer subtract(int a, int b) {
	return a-b;
}

Integer multiply(int a, int b) {
	return a*b;
}

Integer divide(int a, int b) {
	return a/b;
}

Integer square(int num) {
	return (num*num);
}
	
	
	
public static void main(String[]args) {
	
	Calc c = new Calc();
    System.out.println(c.add(5, 6));
    System.out.println(c.subtract(10,5));
    System.out.println(c.multiply(2, 5));
    System.out.println(c.divide(100,5));
    System.out.println(c.square(7));
}
	
}

