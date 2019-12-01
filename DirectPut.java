package sort;

import java.util.Arrays;

/**
 * @author Henry
 * @date 2019/12/1
 */
public class DirectPut {

    public static void sort1(int[] array){
        if(array == null || array.length == 0) return;
        for (int i = 1; i < array.length; i++) {
            int j = i-1;
            int temp = array[i];
            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] array = {6,5,3,1,8,7,2,4};
        System.out.println(Arrays.toString(array));
        sort1(array);
        System.out.println(Arrays.toString(array));
    }
}
