package sort;

import java.util.Arrays;

/**
 * @author Henry
 * @date 2019/12/1
 */
public class Merge {

    public static int[] sort(int[] array){
        if(array.length <= 1){
            return array;
        }
        int num = array.length >> 1;

        int[] left = Arrays.copyOfRange(array, 0, num);
        int[] right = Arrays.copyOfRange(array, num, array.length);
        return mergeTwoArray(sort(left), sort(right));
    }


    public static int[] mergeTwoArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a.length && j < b.length){
            if(a[i] >= b[j]){
                result[k++] = a[i++];
            }else{
                result[k++] = b[j++];
            }
        }

        while(i < a.length){
            result[k++] = a[i++];
        }

        while(j < b.length){
            result[k++] = b[j++];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println(array.length >> 1);
        int[] result = sort(array);
        System.out.println(Arrays.toString(result));
    }
}
