import java.util.Arrays;

public class Solve10 {

    static int factorial(int n){
        if(n < 2) return 1;
        else {
            return n*factorial(n-1);
        }
    }

    static int[] solve10(){
        int fact10 = factorial(10);
        System.out.println(fact10);
        int i=0,j=0;

        for(i=0; i <= 9; i++){
            for(j=0; j<=9; j++){
                if(factorial(i)+factorial(j) == fact10){
                    return new int[] {i,j};
                }else continue;
            }
        }
    return new int[] {0,0};
    }

    public static void main(String args[]){
     System.out.println(Arrays.toString(solve10()));
    }
}
