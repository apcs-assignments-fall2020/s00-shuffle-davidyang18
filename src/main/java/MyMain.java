import java.util.Arrays;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int [] new_one = new int [arr.length];
        int half = arr.length / 2;
        // split the numbers into two parts
        int i = 0;
        int j = 0;
        // copy numbers from the original one to the new array with 1 number space in between
        for (i = 0; i < half; i++) {
            new_one[j] = arr[i];
            j += 2;
        }
        // reset the starting position of the new array to add shuffle-numbers (the bigger ones in this case)
        j = 1;
        // use the same method for the second half of the array
        for (i = half; i < arr.length; i++) {
            new_one[j] = arr[i];
            j += 2;
        }
        // pass the shuffled numbers back into the original
        for (i = 0; i < arr.length; i++) {
            arr[i] = new_one[i];
        }
        return new_one;
    }
    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int rand_num = (int) Math.random();
        for (int i = arr.length - 1; i > 0; i--) {
            int num = arr.length * rand_num;
            int temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int [] test_arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        perfectShuffle(test_arr);
        System.out.print(Arrays.toString(test_arr));
        selectionShuffle(test_arr);
        System.out.print(Arrays.toString(test_arr));
    }
}
