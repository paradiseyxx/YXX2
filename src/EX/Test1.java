package EX;




//import org.junit.Test;

public class Test1 {

    public static void main(String args[]){
        int count = 0;	//记录最大连消次数,初始为0
        int score = 0;	//最终得分,初始为0
        int sequence = 0;	//记录最大连消次数初始连消的索引
        String number="142233241";	//初始的数字串
        for (int i = 0; i < number.length()-1; i++) {		//遍历数字串,判断到倒数第二个数
            // 第一次遍历时,i索引与i+1索引的数相同,则可以添加一个相同的数,进行消除,后续消除由字符串内数字自动消除
            int countOne = 0;	//记录单轮循环连消次数
            if (number.charAt(i) == number.charAt(i+1)) {	//第一次消除
                countOne++;
                if (i==0) {
                    String s = number.substring(i+1);
                    countOne = getCount(s,countOne);
                }else if(i>0 && i<(number.length()-1)){
                    String s1 = number.substring(0, i); 	//i索引前面的字符串
                    String s2 = number.substring(i+1);
                    String s = s1+s2;
                    countOne = getCount(s,countOne);
                }else {	//i==sb.length()-2  时
                    String s1 = number.substring(0, i); 	//i索引前面的字符串
                    String s2 = number.substring(i+1);
                    String s = s1+s2;
                    countOne = getCount(s,countOne);
                }
            }
            //单轮循环结束,判断此轮连消次数
            if (countOne>count) {
                count = countOne;
                sequence = i+1;
            }
        }
        //整个字符串循环结束
        if (count==1) {
            score = 100;
        }else if (count==2) {
            score = 100+200;
        }else if (count>=3) {
            score = 100+200+(count-2)*300;
        }
        System.out.println("连消次数: "+count);
        System.out.println("数字位数: "+sequence);
        System.out.println("最大得分: "+score);
    }
    public static int getCount(String number, int count){
        for (int i = 0; i < number.length()-1; i++) {		//遍历数字串,判断到倒数第三个数
            // 第一次遍历时,i与i+1和i+2索引的数相同,则可以添加一个相同的数,进行消除,后续消除由字符串内数字自动消除
            if (number.charAt(i) == number.charAt(i+1)) {	//第一次消除
                count++;
                if (i==0) {
                    String s = number.substring(i);
                    count = getCount(s,count);
                }
            }
        }
        return count;
    }
}
