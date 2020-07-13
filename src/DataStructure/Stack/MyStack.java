package DataStructure.Stack;

/**
 * Created by yxx on 2020/5/27.
 *
 * 栈各种方法
 */
public class MyStack {
    //底层实现是数组
    private int[] arr;
    private int top;

    public MyStack(){
        arr = new int[10];
        top = -1;
    }

    //带参数的构造方法
    public MyStack(int maxsize){
        arr = new int[maxsize];
        top = -1;
    }

    //插入数据
    public void push(int value){
        arr[++top] = value;
    }

    //弹出 移除数据
    public int pop(){
        return arr[top--];
    }

    //查看数据
    public int peek(){
        return arr[top];
    }

    //判断是否为空
    public boolean isEmpty(){
        return top == -1;
    }

    //判断是否满了
    public boolean isFull(){
        return top == arr.length - 1;
    }
}
