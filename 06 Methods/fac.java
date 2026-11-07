public class fac{
    static int factori(int n){
        if(n < 1){
            throw new IllegalArgumentException(
                "n must be non-negative"
            );
        }
        if(n <= 1){
            return 1;
        }

        return n * factori(n-1);
    }

    public static void main(String[] args) {
        int result  = factori(6);
        System.out.println(result);
    }
}