/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description : 旋转图像
 *  1 2 3            7  4  1
 *  4 5 6  ******>   8  5  2
 *  7 8 9            9  6  3
 *
 * @date 2021/8/15 17:50
 */
public class RotateImage {
    public static  void main(String[] args){
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        //先进行上下更换
        System.out.println("长度为："+len);
        for(int i =0;i<len/2;i++){
            int temp[] = matrix[i];
            matrix[i] = matrix[len-i-1];
            matrix[len-i-1] = temp;
        }
        //对角线更换
        for(int i = 0 ;i<len ;++i){
            for(int j = i+1;j<len;++j){
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[j][i];
                matrix[j][i] =  temp;
            }
        }
    }
}
