package DataStructure.Queue;

/**
 * Created by yxx on 2020/5/27.
 *
 * ѭ�����еķ���
 */
public class MyCycleQueue {
    //�ײ�ʹ������
    private int[] arr;
    //��Ч���ݵĴ�С
    private int elements;
    //��ͷ
    private int front;
    //��β
    private int end;

    //Ĭ�Ϲ��췽��
    public MyCycleQueue(){
        arr = new int[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    //���ι��췽����
    public MyCycleQueue(int maxsize){
        arr = new int[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    //������ݣ��Ӷ�β����
    public void insert(int value){
        if (end == arr.length - 1){
            end = -1;
        }
        arr[++end] = value;
        elements++;
    }

    //ɾ�����ݣ��Ӷ�ͷɾ��
    public int remove(){
        int value = arr[front++];
        if (front == arr.length){
            front = 0;
        }
        elements--;
        return value;
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
