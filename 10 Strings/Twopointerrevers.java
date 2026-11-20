public class Twopointerrevers {
    
    static boolean reverse(String name){

        int left = 0;
        int right = name.length()- 1;

        while(left  < right){

            if(name.charAt(left) != name.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        String name = "BOBOB";
        
        
        System.out.println(reverse(name));

        
    }
}
