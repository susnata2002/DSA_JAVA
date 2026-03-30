import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
//    static void subsets(String str,String curr,int idx){
//        if(idx==str.length()){
//            System.out.println(curr);
//            return;
//        }
//        subsets(str,curr,idx+1);
//        subsets(str,curr+str.charAt(idx),idx+1);
//
//    }

    static void subsets(String str, String curr, int idx, List<String> list){
        if(idx == str.length()){
            list.add(curr);
            return;
        }
        subsets(str, curr, idx + 1, list);
        subsets(str, curr + str.charAt(idx), idx + 1, list);
}

        // D
    public static void main(String[] args) {
//        subsets("ABC","",0);

            List<String> list = new ArrayList<>();
            subsets("abc", "", 0, list);
            Collections.sort(list);
            for(String s : list) System.out.println(s);

        }
}
