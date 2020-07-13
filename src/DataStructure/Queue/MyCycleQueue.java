package DataStructure.Queue;

/**
 * Created by yxx on 2020/5/27.
 *
 * 循环队列的方法
 */
public class MyCycleQueue {
    //底层使用数组
    private int[] arr;
    //有效数据的大小
    private int elements;
    //队头
    private int front;
    //队尾
    private int end;

    //默认构造方法
    public MyCycleQueue(){
        arr = new int[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    //带参构造方法；
    public MyCycleQueue(int maxsize){
        arr = new int[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    //添加数据，从队尾插入
    public void insert(int value){
        if (end == arr.length - 1){
            end = -1;
        }
        arr[++end] = value;
        elements++;
    }

    //删除数据，从队头删除
    public int remove(){
        int value = arr[front++];
        if (front == arr.length){
            front = 0;
        }
        elements--;
        return value;
    }

    //查看数据，从队头查看
    public int peek(){
        return arr[front];
    }

    //判断是否为空
    public boolean isEmpty(){
        return elements == 0;
    }

    //判断是否满了
    public boolean isFull(){
        return elements == arr.length;
    }
}
