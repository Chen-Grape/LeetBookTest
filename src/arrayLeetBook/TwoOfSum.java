/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description : 两数之和
 *
 * @date 2021/8/15 15:23
 */
public class TwoOfSum {
    public static  void main(String[] args){
        int[] nums = new int[]{2,3,4};
        int[] ints = twoSum(nums, 6);

        for (int k = 0 ;k<ints.length;k++){
            System.out.println(ints[k]);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
