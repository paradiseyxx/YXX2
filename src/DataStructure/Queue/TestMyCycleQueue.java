package DataStructure.Queue;

/**
 * Created by yxx on 2020/5/27.
 *
 * 循环队列测试类
 */
public class TestMyCycleQueue {
    public static void main(String args[]){
        MyCycleQueue mq = new MyCycleQueue(4);

        //插入数据
        mq.insert(4);
        mq.insert(1);
        mq.insert(6);
        mq.insert(2);

        //查看是否满了
        System.out.println(mq.isFull());

        //查看是否为空
        System.out.println(mq.isEmpty());

        //查看队头元素
        System.out.println(mq.peek());

        //移除数据
        while (!mq.isEmpty()){
            System.out.print(mq.remove() + " ");
        }

        //循环数组不报错 end
        mq.insert(7);

        //查看队头元素
        System.out.println(mq.peek());

        //再次查看是否为空
        System.out.println(mq.isEmpty());

    }
}
