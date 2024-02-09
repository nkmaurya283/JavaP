package sort;

import java.util.Arrays;
//time complexity o(n2)
public class IInsertionSort2 {

    public static void main(String[] args) {
        int[] arr={2,1,4,4,2,5,8,3};

        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;

            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
