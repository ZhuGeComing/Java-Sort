package sort;

import java.util.Arrays;

/**
 * @author Henry
 * @date 2019/11/30
 */
public class Bubble {


    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 6, 5};
        System.out.println(Arrays.toString(array));
        System.out.println("=======");
        sort1(array);

    }

    public static void sort1(int[] array) {
        if(array == null || array.length == 0) return;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[i]) swapByAlgorithm(array, i, j);
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void swapByTemp(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void swapByAlgorithm(int[] array, int i, int j){
        array[i] = array[j] + array[i];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

}
