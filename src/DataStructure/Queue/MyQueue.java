package DataStructure.Queue;

import DataStructure.Stack.MyStack;

/**
 * Created by yxx on 2020/5/27.
 *
 * ���еķ���
 */
public class MyQueue {
    //�ײ�ʹ������
    private int[] arr;
    //��Ч���ݵĴ�С
    private int elements;
    //��ͷ
    private int front;
    //��β
    private int end;

    //Ĭ�Ϲ��췽��
    public MyQueue(){
        arr = new int[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    //���ι��췽����
    public MyQueue(int maxsize){
        arr = new int[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    //������ݣ��Ӷ�β����
    public void insert(int value){
        arr[++end] = value;
        elements++;
    }

    //ɾ�����ݣ��Ӷ�ͷɾ��
    public int remove(){
        elements--;
        return arr[front++];
    }

    //�鿴���ݣ��Ӷ�ͷ�鿴
    public int peek(){
        return arr[front];
    }

    //�ж��Ƿ�Ϊ��
    public boolean isEmpty(){
        return elements == 0;
    }

    //�ж��Ƿ�����
    public boolean isFull(){
        return elements == arr.length;
    }
}
