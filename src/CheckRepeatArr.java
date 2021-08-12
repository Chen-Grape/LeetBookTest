import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description : 查找重复元素
 *
 * @date 2021/8/2 17:41
 */
public class CheckRepeatArr {
    public static void main(String[] args){
        int[] nums ={1,2,3,1};
        boolean b = containsDuplicate(nums);

        System.out.println("是否存在重复元素"+b);
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        for(int i = 0;i< nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                flag = true;
            }
        }
        return flag;
    }
}


