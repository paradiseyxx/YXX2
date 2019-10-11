package String;

//StringBuilder²Ù×÷
public class StrB {
    public static void main(String args[]){
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ho");
        StringBuilder sb3 = new StringBuilder("heeeello");
        for (int i=0;i<5;i++){
            sb1.append(i);
        }
        System.out.println(sb1);
        sb2.insert(1,"ell");
        System.out.println(sb2);
        sb3.delete(2,5);
        System.out.println(sb3);
    }
}
