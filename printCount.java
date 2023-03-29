public class printCount{
    public static void main(String[] args) {
        int n=5;
        printCounts(n);
    }
    public static void printCounts(int num){
       if(num==0){
        return ;
       }
       printCounts(num-1);
       System.out.println(num);
    //    printCounts(num+1);
        
    }
}