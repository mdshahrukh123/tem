public class printArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        arrayPrint(arr,0);
    }
    public static void arrayPrint(int arr[],int idx){
        if(idx==arr.length){
            return ;
        }
        System.out.println(arr[idx]);
        arrayPrint(arr,idx+1);
        // System.out.println(arr[idx]);
    }
}
