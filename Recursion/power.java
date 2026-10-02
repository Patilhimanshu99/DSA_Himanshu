public class power{
    public static int powerSq(int x, int n){ //Time complexity = O(n)
        if(n==1){
            return x;
        }
        int x1 = powerSq(x, n-1); //x^(n-1)
        int x2 = x*x1; //x^(n)
        return x2;
    }
    public static long optimizedPowerSq(long x, long n){ //Time complexity = O(logn)
        if(n==0){
            return 1;
        }
        long halfPower = optimizedPowerSq(x, n/2);
        long halfPowerSq = halfPower * halfPower;
        if(n%2!=0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }// long for bigger value(upto 2^63) and int for samller value(upto 2^31)
    public static void main(String[] args) {
        int x = 2;
        int n = 62;
        System.out.println(optimizedPowerSq(x, n));
    }
}