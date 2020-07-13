package DataStructure.Stack;

/**
 * Created by yxx on 2020/5/27.
 *
 * 栈测试类
 */
public class TestMyStack {
    public static void main(String args[]){
        MyStack myStack = new MyStack(4);

        //添加数据
        myStack.push(5);
        myStack.push(3);
        myStack.push(1);
        myStack.push(2);

        //判断栈是否为空
        System.out.println(myStack.isEmpty());

        //判断栈是否满了
        System.out.println(myStack.isFull());

        //查看栈顶数据
        System.out.println(myStack.peek());

        //弹出数据
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop() + " ");
        }

        //再次判断是否为空
        System.out.println(myStack.isEmpty());

        //再次判断是否满了
        System.out.println(myStack.isFull());
    }
}
