package Number;

import java.math.BigDecimal;

public class BigDecimalDemo {
	static final int location = 10;
	
	/**
	 * ����ӷ�����������Ϊ�����뱻����
	 * 
	 * @param value1
	 * ��ӵĵ�һ����
	 * @param value2
	 * ��ӵĵڶ�����
	 * @return ����֮��
	 */
	public BigDecimal add(double value1,double value2) {
		//ʵ����Decimal����
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}
	
	/**
	 * �����������������Ϊ�����뱻����
	 * 
	 * @param value1 ������
	 * @param value2 ����
	 * @return ������
	 */
	public BigDecimal sub(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.subtract(b2);
	}
	
	/**
	 * ����˷�����������Ϊ�����뱻����
	 * 
	 * @param value1 ��һ������
	 * @param value2 �ڶ�������
	 * @return
	 */
	public BigDecimal mul(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.multiply(b2);
	}
	
	/**
	 * �����������������Ϊ�����뱻����
	 * @param value1 ������
	 * @param value2 ����
	 * @return
	 */
	public BigDecimal div(double value1,double value2) {
		return div(value1, value2,location);
	}
	
	//������������������ֱ�Ϊ�����뱻�����Լ���С������λ��
	public BigDecimal div(double value1,double value2,int b) {
		if (b < 0) {
			System.out.println("bֵ������ڵ���0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		//���ó�����������С�������bλ������������������������
		return b1.divide(b2,b,BigDecimal.ROUND_HALF_UP);
	}
	
	public static void main(String args[]) {
		BigDecimalDemo b = new BigDecimalDemo();
		//�ӷ�
		System.out.println(b.add(-7.5, 8.9));
		//����
		System.out.println(b.sub(-7.5, 8.9));
		//�˷�
		System.out.println(b.mul(-7.5, 8.9));
		//������С�������10λ
		System.out.println(b.div(10, 2));
		//������С�������10λ
		System.out.println(b.div(10, 2, 10));
		//������С�������5λ
		System.out.println(b.div(-7.5, 8.9, 5));
	
	}
}
