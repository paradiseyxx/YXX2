package Array;

//foreach±éÀúÊı×é
public class Tautog {
    public static void main(String args[]){
        int arr[][]= new int[][]{{4,3},{2,1}};
        int i = 0;
        for (int x[]:arr){
            i++;
            int j= 0;
            for (int e:x){
                j++;
                System.out.println(e);
            }
        }
    }
}
