package Number;

import java.math.BigInteger;

//BigInteger�ദ����
public class BigIntegerDemo {
	public static void main(String args[]) {
		BigInteger bigInstance = new BigInteger("4");
		System.out.println("�ӷ�����"+bigInstance.add(new BigInteger("2"))); //��ʮ����2ת��ΪBigInteger��ʽ
		System.out.println(bigInstance.subtract(new BigInteger("2")));
		System.out.println(bigInstance.multiply(new BigInteger("2")));
		System.out.println(bigInstance.divide(new BigInteger("3")));
		//��
		System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[0]);
		//����
		System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[1]);
		System.out.println(bigInstance.pow(2));
		System.out.println(bigInstance.negate());
	}
}
