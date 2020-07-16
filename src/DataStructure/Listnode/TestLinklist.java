package DataStructure.Listnode;

/**
 * Created by yxx on 2020/7/15.
 *
 * ²âÊÔÁ´±í
 */
public class TestLinklist {
    public static void main(String args[]){
        Linklist linklist = new Linklist();

        linklist.insert(6);
        linklist.insert(4);
        linklist.insert(2);
        linklist.insert(1);

        linklist.display();

        linklist.delete();
        linklist.display();

        Node node = linklist.find(2);
        node.display();

        Node node1 = linklist.deleteval(4);
        node1.display();
        linklist.display();
    }
}
