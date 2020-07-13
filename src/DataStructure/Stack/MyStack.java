package DataStructure.Stack;

/**
 * Created by yxx on 2020/5/27.
 *
 * ջ���ַ���
 */
public class MyStack {
    //�ײ�ʵ��������
    private int[] arr;
    private int top;

    public MyStack(){
        arr = new int[10];
        top = -1;
    }

    //�������Ĺ��췽��
    public MyStack(int maxsize){
        arr = new int[maxsize];
        top = -1;
    }

    //��������
    public void push(int value){
        arr[++top] = value;
    }

    //���� �Ƴ�����
    public int pop(){
        return arr[top--];
    }

    //�鿴����
    public int peek(){
        return arr[top];
    }

    //�ж��Ƿ�Ϊ��
    public boolean isEmpty(){
        return top == -1;
    }

    //�ж��Ƿ�����
    public boolean isFull(){
        return top == arr.length - 1;
    }
}
