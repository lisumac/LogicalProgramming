package stringproblemss;

public class PlindromeNumber {


    public static boolean isPalindrome(int x) {
        int sum=0;
        int temp =x;
        int reminder =0;
        while(x>0){
            reminder = x%10;
            sum = (sum * 10)+reminder;
            x=x/10;

        }
        if(sum == temp)  {
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Numver is palindrom +"+isPalindrome(121));
    }
}
