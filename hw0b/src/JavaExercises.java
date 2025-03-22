import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        int[] diceArray = {1, 2, 3, 4, 5, 6};
        return diceArray;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        if (customer.equals("Ergun")) 
        {
            return new String[] { "beyti", "pizza", "hamburger", "tea" };
        }
        else if (customer.equals("Erik")) 
        {
            return new String[] { "sushi", "pasta", "avocado", "coffee" };
        } else return new String [3];
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
      int min = array[0];
      for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i]; 
        }
      }
      int max = array[0];
      for (int j = 0; j < array.length; j++) {
        if (array[j] > max) {
            max = array[j];
        }
      }
      int diff = max - min;
    return diff;  
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        list.add(x);
        if (x==1){
            return list;
        }
        if(x % 2 == 0){
          return hailstoneHelper(x/2, list);
        }
        else return hailstoneHelper((x * 3) + 1, list);
    }

    public static void main(String[] args){
        // case 1
        int[] dice = makeDice();
        for (int i = 0; i < dice.length; i++) {
            System.out.print(dice[i]+ " ");
        }
        
        //case 2
        String[] orderForErgun = takeOrder("Ergun");
        for (String item : orderForErgun) {
            System.out.println(item);
        }

        //case 3
        int[] array = {1, 2, 3, 4 ,5};
        int result = findMinMax(array);
        System.out.println(result); 


        // case 4
        List<Integer> sequence = hailstone(7);
        System.out.println(sequence); 

    }

}



