package lecture09;

public class SimpleRecursion {

    public static void main(String[] args) {

        System.out.println(findLength("Dean"));
        reverseRecPrint("Dean");
    }

    public static int findLength(String word){

        if(word == null || word.equals("")) // base case
            return 0;
        else
            return 1 + findLength(word.substring(1)); // recursive case
    }

    public static void recPrint(String word){
        if(word == null || word.equals("")) // base case
            return;
        else{
            System.out.println(word.charAt(0));
            recPrint(word.substring(1));
        }
    }

    public static void reverseRecPrint(String word){
        if(word == null || word.equals("")) // base case
            return;
        else{
            reverseRecPrint(word.substring(1));
            System.out.println(word.charAt(0));
        }
    }
}
