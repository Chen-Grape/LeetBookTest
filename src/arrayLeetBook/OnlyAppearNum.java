import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description :数组中查找不重复的数字 利用set不能插入重复值的特性
 *
 * @date 2021/8/3 9:33
 */
public class OnlyAppearNum {
   public   static  void main(String[] args){
       int[] nums= {2,2,1};
       int num = singleNumber(nums);
       System.out.println("不重复的数字为："+num);
   }

    //只出现一次的数字
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return (int) set.toArray()[0];
    }
}
