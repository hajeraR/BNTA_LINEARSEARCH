import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LinearSequence {


    public static void main(String[] args) {
        int[] result = GenerateArray(10);
//        int questionTwo = GenerateKey(5);
//        int secondResult = LinearSearch(result, 3);
        //System.out.println("index: " + secondResult);
        System.out.println(Arrays.toString(result));
    }

    //Part 1 - given a number, N, make a function that will generate an array of numbers 1 to N.
    public static int[] GenerateArray( int N) {
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }
        return numbers;

    }

    //We only have one input - O(N) - transversing through array to print each element. Here, we need to access all the elements one by one, so the calculation time increases at the same pace as the input.

    //Part 2 - Given the same range of numbers, 1 to N, write a function to generate a key which will be the number in our generated array that our search algorithm should find.

    public static int GenerateKey( int key) {
        Random random = new Random();
         int number = random.nextInt(1, key + 1);
         return number;
    }



    //Part 3 -Given an array and key, implement the linear search algorithm to search through the array until it finds the key. When it does this, return the number of steps taken to find the key.

    public static int LinearSearch(int[] result, int key) {

        for (int i = 0; i < result.length; i++) {
            if (result[i] == key){
                return i;
            }
        }
        return -1;
    }





}
