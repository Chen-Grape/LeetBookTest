/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description :去重重复数据并返回数组长度
 *
 * @date 2021/8/2 15:47
 */
public class ArrayDistinct {
    public static  void main(String[] args){
        int[] nums = {1,1,2};
        int i = removeDuplicates(nums);
        System.out.println("剩余数组长度i "+i );
        for (int j= 0 ;j< i;j++){
            System.out.println("数组"+nums[j] );
        }
    }
    ///调用方法
    //具体实现方法 双指针
    //相同的时候
    /**
     * @description 去重重复数据并返回数组长度
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int count = 0;//计算重复的数量
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){///重复的数据 变量进行增加
                count++;
            }else{
                nums[i-count] = nums[i]; //将后面的值往前放并且赋值操作
            }
        }
        return nums.length - count;
    }
}


