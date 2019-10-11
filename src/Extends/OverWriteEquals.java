package Extends;
//Object¿‡equals()∑Ω∑®
class V{
	
}

public class OverWriteEquals {
	public static void main(String args[]) {
		String str1 = "123";
		String str2 = "123";
		System.out.println(str1.equals(str2));
		V v1 = new V();
		V v2 = new V();
		System.out.println(v1.equals(v2));
	}
}
