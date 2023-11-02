
import java.util.Random;

public class ArrayShuffle {
    
    // this is a parameterized constructor which is shuffling the array
    ArrayShuffle(int array[])
    {
         int n = array.length;
        Random r = new Random();

        for (int i = 0; i < n - 1; i++) {
            // This statement is generating the random number between index i and n-i 
            int randomIndex = i + r.nextInt(n - i);

            // Swap array[i] and array[randomIndex]
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        new ArrayShuffle(arr);
        
// printing the shuffled array
        System.out.print("Shuffled Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

 
}

