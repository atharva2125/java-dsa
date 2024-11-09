public class bst {
    public int stocks (int prices[]) {
       int buy=0;
       int sell=1;
       int maxProfit=0;
       for(;sell<prices.length;sell++){
         if(prices[sell]<prices[buy]){
            buy = sell; 
         }
         else{
            int profit = prices[sell]-prices[buy];
            maxProfit = Math.max(maxProfit,profit);
         }
       }
       return maxProfit;
    }

    public static void main(String args[]){
        bst bst = new bst();
        int arr[] = {7,1,5,3,6,4};
        System.out.println(bst.stocks(arr));
    }
}
