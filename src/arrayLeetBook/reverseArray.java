/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description : 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 *使用临时数组
 * @date 2021/8/2 17:13
 */
public class reverseArray {
    public static  void  main(String[] args){
        int temp[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(temp,k);
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
//        int temp[] = new int[length];
         int temp[] =  nums.clone();//优化
//        for(int i=0;i<length;i++){
//            temp[i] = nums[i];
//        }
        for (int i = 0; i < length; i++) {
            //1+3%7  4+3%7=0
            nums[(i + k) % length] = temp[i];
        }
    }
}
