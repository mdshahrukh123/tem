public class fibbonacci {
    public static void main(String[] args) {
        int ans=printFibbonacci(6);
        System.out.println(ans);
    }
    public static int printFibbonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int ls=printFibbonacci(n-1);
        int rs=printFibbonacci(n-2);
        return ls+rs;
    }
}
