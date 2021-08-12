import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description : 查找两个数组的交集
 *
 * @date 2021/8/7 14:18
 */
public class FindArrayIntersection {
    public static  void main(String [] Args){
        //[1,2,2,1]
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2,};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(intersect);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 ;
        int j = 0 ;
        List<Integer> list = new ArrayList<>();
        while(i <nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]){
                j++ ;
            }else {
                list.add(nums2[j]);
                i++;
                j++;
            }

        }
        int [] res = new int[list.size()];
        for (int k = 0 ;k < list.size() ;k++){
            res[k] = list.get(k);
        }
        return  res;
    }
}
