import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static String swap(String st){

        Set<String > xxx = new SetList<>();

        Set<String> zbior = new HashSet<String>();

        String result = "";
        char[] letters = st.toCharArray();

        for(char letter : letters){
            if( letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
                result+=Character.toUpperCase(letter);
            }else{
                result+=letter;
            }
        }
        return result;
    }
}

//public class Kata {
//    public static String swap(String str) {
//        return str.chars()
//                .mapToObj(c -> String.valueOf((char) c))
//                .map(c -> "aeiou".contains(c) ? c.toUpperCase() : c)
//                .collect(Collectors.joining(""));
//    }
//}