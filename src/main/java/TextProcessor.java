public class TextProcessor {


    public String returnVers(String s) {

        return s.toUpperCase();
    }

    public String returnGem(String s) {

        return s.toLowerCase();
    }

    public String reverse(String s){

        StringBuilder str =new StringBuilder(s);
        StringBuilder reverseStr = str.reverse();
        return reverseStr.toString();
    }


}