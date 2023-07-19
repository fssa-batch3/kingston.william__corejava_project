package day10.misc;


class Divider{
	public static int divisor (int a, int b)throws IllegalArgumentException{
		if (b==0) 
			throw new IllegalArgumentException("divisor cant be zero");	
			else return a/b;}
	}

class MainValidator {
public static void main(String[] args) {
	System.out.println(Divider.divisor(10, 0));
}
}
