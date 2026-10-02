public class factorial{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f1 = fact(n-1); // fn - 1
        int f = n*fact(n-1); // fn
        return f;
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int s1 = sum(n-1);
        int s = n + s1;
        return s;
    }
    public static void main(String[] args) {
        int n = 5;
       // System.out.println(fact(n));
       System.out.println(sum(n));;
    }
}