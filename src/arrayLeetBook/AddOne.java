/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description :
 *
 * @date 2021/8/7 14:51
 */
public class AddOne {
    public static void main(String[] args){
        int digits[] = {1,2,3,9};
        int[] ints = plusOne(digits);
    }

    /**
     * 数组某位加一
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
//        //
//        int len = digits.length -1;
//        if (digits[len] != 9){
//            digits[len] += 1;
//        }else{
//            digits[len] = 0 ;
//        }
//        return digits;
//        String str = "";
//        for(int i=0; i<digits.length; i++){
//            String s = new String();
//            int z = digits[i];
//            s = Integer.toString(z);
//            str = str.concat(s);
//        }
//        int num = Integer.parseInt(str)+1;
//        String numStr = String.valueOf(num);
//        int arr[] = new int [numStr.length()];
//        for(int j= 0 ;j<numStr.length();j++){
//            arr[j] = Integer.parseInt(numStr.substring(j,j+1));
//        }
//        return arr;
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                //如果数组当前元素不等于9，直接加1
                //然后直接返回
                digits[i]++;
                return digits;
            } else {
                //如果数组当前元素等于9，那么加1之后
                //肯定会变为0，我们先让他变为0
                digits[i] = 0;
            }
        }
        //除非数组中的元素都是9，否则不会走到这一步，
        //如果数组的元素都是9，我们只需要把数组的长度
        //增加1，并且把数组的第一个元素置为1即可
        int temp[] = new int[length + 1];
        temp[0] = 1;
        return temp;
    }
}

