package LC.easy;

/**
 * Created by YXX on 2020/3/17.
 *
 * 66. º”“ª
 */
public class PlusOne {
    public static void main(String args[]){
        int[] nums = new int[]{4,9};
        PlusOne po = new PlusOne();
        int[] res = po.plusOne(nums);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
    public int[] plusOne(int[] digits){
        int[] digitsnew = new int[digits.length + 1];
        digitsnew[0] = 1;
        for (int i = digits.length - 1; i >= 0;i--){
            if (digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }else {
                digits[i] = 0;
            }
        }if (digits[0] == 0){
            return digitsnew;
        }
        return digits;
    }
}
