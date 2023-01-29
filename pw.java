import java.util.Scanner;
import java.util.ArrayList;

public class KeypadcomboREcursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> combo = getKPC(str);
        System.out.println(combo);   
    }

    static String[] list = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"}; //Global vraibele
    
    static ArrayList<String> getKPC(String str){
        if (str.length()==0){
            ArrayList bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
        
       String forchr = list[ch-'0'];
        for(int i= 0; i<forchr.length(); i++){
            char rchr = forchr.charAt(i);
            for( String rstr:rres){
                mres.add(rchr + rstr);
            }
        }
        return mres;
    }
}