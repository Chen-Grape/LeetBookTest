/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description :  移动数组0
 *
 * @date 2021/8/7 16:55
 */
public class MoveZeros {
    public static void main(String[] rgs){
        int[] nums = {0,1,0,3,12} ;
        int[] ints = moveZeroes(nums);
        for (int j=0;j< ints.length ;j++){
            System.out.println("当前数组"+j +":"+ints[j]);
        }
    }
    public static int[] moveZeroes(int[] nums) {
        int i = 0;//统计前面0的个数
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {//如果当前数字是0就不操作
                i++;
          } else if (i != 0) {
                //否则，把当前数字放到最前面那个0的位置，然后再把
                //当前位置设为0
                nums[j - i] = nums[j];
                nums[j] = 0;
            }
        }
        return nums;
    }
}
