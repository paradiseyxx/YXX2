package Number;
//X进制之间的转换
public class Charac {
	public static void main(String args[]) {
		//十进制
		String str1 = Integer.toString(456);
		//二进制
		String str2 = Integer.toBinaryString(456);
		//八进制
		String str3 = Integer.toOctalString(456);
		//八进制
		String str4 = Integer.toHexString(456);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
