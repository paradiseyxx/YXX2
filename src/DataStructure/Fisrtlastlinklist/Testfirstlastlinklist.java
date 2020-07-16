package DataStructure.Fisrtlastlinklist;

/**
 * Created by yxx on 2020/7/15.
 *
 * ²âÊÔ
 */
public class Testfirstlastlinklist {
    public static void main(String args[]){
        FirstLastLinklist firstLastLinklist = new FirstLastLinklist();
//        firstLastLinklist.insert(6);
//        firstLastLinklist.insert(4);
//        firstLastLinklist.insert(2);
//        firstLastLinklist.insert(1);
//        firstLastLinklist.display();
//
//        firstLastLinklist.delete();
//        firstLastLinklist.delete();
//        firstLastLinklist.display();


        firstLastLinklist.insertLast(6);
        firstLastLinklist.insertLast(4);
        firstLastLinklist.insertLast(2);
        firstLastLinklist.insertLast(1);
        firstLastLinklist.display();

        firstLastLinklist.delete();
        firstLastLinklist.delete();
        firstLastLinklist.display();

    }
}
