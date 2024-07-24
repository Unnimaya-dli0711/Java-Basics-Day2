import java.util.Arrays;

public class ArraysPractice {
    public static void main(String [] args){
        int[] arr={9,8,7,6,5};
        System.out.println(Arrays.asList(Arrays.toString(arr)));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,1,4,8));

    }
}
