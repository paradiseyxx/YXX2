package DataStructure.Queue;

/**
 * Created by yxx on 2020/5/27.
 *
 * ���в�����
 */
public class TestMyQueue {
    public static void main(String args[]){
        MyQueue mq = new MyQueue(4);

        //��������
        mq.insert(4);
        mq.insert(1);
        mq.insert(6);
        mq.insert(2);

        //�鿴�Ƿ�����
        System.out.println(mq.isFull());

        //�鿴�Ƿ�Ϊ��
        System.out.println(mq.isEmpty());

        //�鿴��ͷԪ��
        System.out.println(mq.peek());

        //�Ƴ�����
        while (!mq.isEmpty()){
            System.out.print(mq.remove() + " ");
        }

        //��ѭ�����鱨�� end
        //mq.insert(7);

        //�ٴβ鿴�Ƿ�Ϊ��
        System.out.println(mq.isEmpty());

    }
}
