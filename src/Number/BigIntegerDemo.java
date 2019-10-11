package Number;

import java.math.BigInteger;

//BigInteger类处理数
public class BigIntegerDemo {
	public static void main(String args[]) {
		BigInteger bigInstance = new BigInteger("4");
		System.out.println("加法操作"+bigInstance.add(new BigInteger("2"))); //将十进制2转换为BigInteger形式
		System.out.println(bigInstance.subtract(new BigInteger("2")));
		System.out.println(bigInstance.multiply(new BigInteger("2")));
		System.out.println(bigInstance.divide(new BigInteger("3")));
		//商
		System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[0]);
		//余数
		System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[1]);
		System.out.println(bigInstance.pow(2));
		System.out.println(bigInstance.negate());
	}
}
