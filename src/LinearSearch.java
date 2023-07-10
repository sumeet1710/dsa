import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        String name="sumeet";
        char ch='k';
//boolean ans=findChar(name,ch);
        System.out.println(findChar(name,ch));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean findChar(String str,char ch)
    {
        if(str.length()==0){
            return false;
        }
      //  for(int i=0;i<str.length();i++){
        //    if(ch==str.charAt(i)){
        //        return true;
        for(char cha:str.toCharArray()){
            if(cha==ch){
                return true;
            }
        }return false;

    }
}
