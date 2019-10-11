package Extends;
//instanceof 向下转型
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
		//判断父类对象是否为Parallelogram子类的一个实例
		if(q instanceof Parallelogram) {
			Parallelogram p = (Parallelogram)q; //向下转型
		}
		if (q instanceof Square) {
			Square s = (Square)q; //向下转型
		}
		//由于q对象不为Anything类的对象，所以这条语句是错误的
		//System.out.println(q instanceof Anything);
	}
}