public class PlandormeStr {
    
    public static boolean isPalindrome(String str) {

        String reverse = new StringBuilder(str)
                        .reverse()
                        .toString();


        return str.equals(reverse);
    }

    public static void main(String[] args) {
        
        String str  = "bobu";

        if(isPalindrome(str)){
            System.out.println("Palindrome..");
        }
        else{
            System.out.println("It is not palindrome..");
        }
    }
}
