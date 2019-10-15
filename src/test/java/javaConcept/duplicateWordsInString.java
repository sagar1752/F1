package javaConcept;
import java.util.HashMap;
import java.util.Set;
public class duplicateWordsInString {
	
    static void duplicateWords(String inputString)
    {
        //Splitting inputString into words
        String[] words = inputString.split(" ");
        //Creating one HashMap with words as key and their count as value
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        //Checking each word
        for (String word : words)
        {
            //whether it is present in hashMap
            if(hashMap.containsKey(word.toLowerCase()))
            {
                //If it is present, incrementing it's count by 1
                hashMap.put(word.toLowerCase(), hashMap.get(word.toLowerCase())+1);
            }
            else
            {
                //If it is not present, put that word into hashMap with 1 as it's value
                hashMap.put(word.toLowerCase(), 1);
            }
        }
        //Extracting all keys of hashMap
        Set<String> wordsInString = hashMap.keySet();
        //Iterating through all words in hashMap
        for (String word : wordsInString)
            //if word count is greater than 1
            if(hashMap.get(word) > 1)
            {
            {
                //Printing that word and it's count
                System.out.println(word+" : "+hashMap.get(word));
            }
        }
    }
    public static void main(String[] args)
    {
        duplicateWords("Bread butter and bread");
        duplicateWords("Java is java again java");
        duplicateWords("Super Man Bat Man Spider Man");
    }
}