package Extends;
//instanceof ����ת��
class Quadrangle{
	//SomeSentence
}
class Square extends Quadrangle{
	//SomeSentence
}
class Anything{
	//SomeSentence
}
public class Parallelogram extends Quadrangle {
	public static void main(String args[]) {
		Quadrangle q = new Quadrangle();
		//�жϸ�������Ƿ�ΪParallelogram�����һ��ʵ��
		if(q instanceof Parallelogram) {
			Parallelogram p = (Parallelogram)q; //����ת��
		}
		if (q instanceof Square) {
			Square s = (Square)q; //����ת��
		}
		//����q����ΪAnything��Ķ���������������Ǵ����
		//System.out.println(q instanceof Anything);
	}
}