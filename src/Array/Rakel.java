package Array;

import java.util.Arrays;

//Êý×é²éÑ¯
public class Rakel {
    public static void main(String args[]){
        String str[] = new String[]{"ab","cd","ef","xy"};
        Arrays.sort(str);
        int index = Arrays.binarySearch(str,0,2,"cd");
        System.out.println(index);
    }
}
