package DataStructure.Stack;

/**
 * Created by yxx on 2020/5/27.
 *
 * ջ������
 */
public class TestMyStack {
    public static void main(String args[]){
        MyStack myStack = new MyStack(4);

        //�������
        myStack.push(5);
        myStack.push(3);
        myStack.push(1);
        myStack.push(2);

        //�ж�ջ�Ƿ�Ϊ��
        System.out.println(myStack.isEmpty());

        //�ж�ջ�Ƿ�����
        System.out.println(myStack.isFull());

        //�鿴ջ������
        System.out.println(myStack.peek());

        //��������
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop() + " ");
        }

        //�ٴ��ж��Ƿ�Ϊ��
        System.out.println(myStack.isEmpty());

        //�ٴ��ж��Ƿ�����
        System.out.println(myStack.isFull());
    }
}
