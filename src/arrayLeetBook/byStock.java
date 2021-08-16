/**
 * Created with IntelliJ IDEA
 * User : Grape
 * Description :  贪心算法 购买股票场景
 *
 * @date 2021/8/2 16:30
 */
public class byStock {
    public static void main(String[] args){
        int[] prices ={7,1,5,3,6,4};
        int total = maxProfit(prices);
        System.out.println("total: "+total);
    }
    public static int maxProfit(int[] prices) {
//        if(prices == null && prices.length <2){
//            //价格空或者 价格波动不足两天
//            return 0;
//        }
//        int total= 0 ,index = 0 ,length = prices.length;
//        if(index<length){
//            //股票一直下跌就一直寻找开始涨幅的地址
//            while(index <length-1 &&prices[index] >= prices[index+1]){
//                //索引小于当前价格长度且一直在下跌
//                index++;
//            }
//            int min = prices[index];//获取当前最低点价格
//            while(index <length-1 &&prices[index] <= prices[index+1]){
//                index++;
//            }
//            //进行累计收益
//            total += prices[index++] - min;
//        }
//        return  total;
        //优化后算法
        int total = 0;
        for (int i = 1 ;i<prices.length;i++){
            total += Math.max(prices[i]-prices[i-1],0);
        }
       return  total ;
    }

}
