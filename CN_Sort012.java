import java.util.Arrays;

public class CN_Sort012 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int l = 0;
        int r = arr.length-1;

        while(arr[l] == 0){
            l++;
        }
        while(arr[r] == 2){
            r--;
        }

        for(int i = l ; i <= r ; i++){
            if(arr[i] == 0){
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                l++;
            }
            if(arr[i] == 2){
                int temp = arr[r];
                arr[r] = arr[i];
                arr[i] = temp;
                r--;i--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
