public class Main {
    public static void main(String[] args) {
        int a = 4;
        int[] arr = {1,4,6,2};
        reverse(arr,0,arr.length-1);
        for(int i = 0; i < arr.length; i++  ){
            System.out.print(arr[i] + " ");
        }

    }
    public static void reverse(int[] arr, int begin, int end  ){
        int temp;
            if(begin >=end){
                return;
            }
           else{
               temp = arr[begin];
               arr[begin] = arr[end];
               arr[end] = temp;
               reverse(arr,begin+1,end-1);
            }
    }





}