package Number;
//�ж��ַ���Сд״̬
public class UpperOrLower {
	public static void main(String args[]) {
		Character myCharacter1 = new Character('A');
		Character myCharacter2 = new Character('a');
		System.out.println(myCharacter1+"�Ǵ�д��ĸ��"+Character.isUpperCase(myCharacter1));
		System.out.println(myCharacter2+"��Сд��ĸ��"+Character.isLowerCase(myCharacter2));
	}
}
