package sort;

import java.util.Arrays;

public class Heap{
    public static void main(String[] args) {
        int[] array = {1,3,2,5,4,6,7};
        System.out.println(Arrays.toString(array));
        System.out.println("=========");;
        sort1(array);

    }


    public static void sort1(int[] array){
        for (int i = 0; i <array.length ; i++) {
            siftUp(i,array);
        }
        int n = array.length-1;
        while(n>0){
            swapByTemp(array, 0, n);
            for (int i = 0; i < n; i++) {
                siftUp(i, array);
            }
            n--;
        }

        System.out.println(Arrays.toString(array));

    }


    public static void siftUp(int k, int[] array){
        while(k>0){
            int parent = (k-1)/2;
            if(array[k]<array[parent]){
                break;
            }
            swapByTemp(array, k, parent);
            k = parent;

        }
    }

    public static void swapByTemp(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
