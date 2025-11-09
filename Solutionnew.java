public class Solutionnew {
 

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            int t=0;
            t = n & (n - 1);
            if(t==0 ) return n;
            else{
                n--;
                System.out.println(n);
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Solutionnew sol = new Solutionnew();
        int n = 4;
        System.out.println(sol.hammingWeight(n));
    }
}


