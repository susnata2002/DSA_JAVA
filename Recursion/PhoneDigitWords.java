import java.util.ArrayList;

public class PhoneDigitWords {
    static String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String> result=new ArrayList<>();
    static ArrayList<String> phnDigWords(int[] arr,int idx, String curr){
        if(idx==arr.length){
            result.add(curr);
            return result;
        }
// If digit is 0 or 1 → skip this digit (do NOT block recursion)
//        This makes:
//        for (i = 0; i < letters[1].length(); i++)
//
        //→ letters[1].length() is 0
        //→ loop does NOT execute
        //→ recursion stops early
        //→ no strings get added
        if (letters[arr[idx]].isEmpty()) {
            phnDigWords(arr, idx + 1, curr);
            return result;
        }
        for(int i=0;i<letters[arr[idx]].length();i++){
            phnDigWords(arr,idx+1,curr+letters[arr[idx]].charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
//        ArrayList<String> atr=new ArrayList<>();
        result.clear();
        int[] arr={5};
//        phnDigWords(arr,0,"");
        System.out.println(phnDigWords(arr,0,""));
    }
}
