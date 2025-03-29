import java.util.List;
import java.util.ArrayList;



public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        int sum = 0;
      for(int i = 0; i < L.size(); i++){
        sum += L.get(i);  
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        
        List<Integer> Even_List = new ArrayList<>();
        for(int i =0; i < L.size(); i++){
            if(L.get(i) % 2 == 0){
               Even_List.add(L.get(i)); 
            }

        }    
        return Even_List;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        
        List<Integer> CommonList = new ArrayList<>();
        for (int i = 0; i < L1.size(); i++){
            for (int j = 0; j < L2.size(); j++){
                if(L1.get(i) == L2.get(j)){
                    CommonList.add(L1.get(i));
                }
            }

        }

        return CommonList;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int OccurNum = 0;
        for(int i = 0; i < words.size(); i++ ){
            String word = words.get(i);
            for (int j = 0; j < word.length(); j++){
                if (word.charAt(j) == c){
                OccurNum ++;
                } 
            }
        }
            
        return OccurNum;
    }



    public static void main(String[] args){
        
        //case 1
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.add(6);
        int result_sum = sum(L);
        System.out.print(result_sum);

        //case 2
        System.out.println(evens(L));

        //case 3
        List<Integer> L1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> L2 = List.of(0, 4, 6, 8, 10, 12);
        System.out.println(common(L1, L2));
    
        //case 4
        List<String> words = List.of("apple", "aze", "cat");
        char c ='a';
        System.out.print(countOccurrencesOfC(words, c));
    
    }

    

}
