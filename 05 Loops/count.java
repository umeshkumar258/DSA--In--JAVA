public class count {
    public static void main(String[] args) {
        int num  = 332343;
        int count = 0;

        while(num > 0){
            count ++;
            num /= 10;
        }
        
        System.out.println(count);
    }
}
