import java.util.*;

public class reverseStr {
    public static void main(String[] args) {
        
        String name = "umesh";

        StringBuilder newname = new StringBuilder();

        for(int i = name.length()-1;i>= 0;i--){

            // System.out.print(name.charAt(i)+ " ");
            newname.append(name.charAt(i));
        }

        System.out.println(newname);


        String word = "hello";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println(reversed);

    }
}
