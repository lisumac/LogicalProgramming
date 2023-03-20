package stringproblemss;

public class Pallindrome {
    public static void main(String[] args) {
        String S = "abba";
        char[]tempString = S.toCharArray();

        int output =0;
        String tempStr = "";
        for(int i=tempString.length -1; i>=0; i--){
            tempStr = tempStr + tempString[i];


        }
        if(tempStr.toLowerCase().equals(S.toLowerCase())){
            output =1;
            System.out.println(output);
        }else{
            output = 0;
            System.out.println(output);
        }
    }

}
