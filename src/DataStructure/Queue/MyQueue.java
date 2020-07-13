package DataStructure.Queue;

import DataStructure.Stack.MyStack;

/**
 * Created by yxx on 2020/5/27.
 *
 * 队列的方法
 */
public class MyQueue {
    //底层使用数组
    private int[] arr;
    //有效数据的大小
    private int elements;
    //队头
    private int front;
    //队尾
    private int end;

    //默认构造方法
    public MyQueue(){
        arr = new int[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    //带参构造方法；
    public MyQueue(int maxsize){
        arr = new int[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    //添加数据，从队尾插入
    public void insert(int value){
        arr[++end] = value;
        elements++;
    }

    //删除数据，从队头删除
    public int remove(){
        elements--;
        return arr[front++];
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
