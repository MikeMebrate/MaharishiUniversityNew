public class Depth {

    static int computeDepth(int n){
        int[] array = new int[10];
        for(int i=0; i<array.length; i++){
            array[i] = -1;
        }
        int index=0, k=1, mul,mod;
        boolean check = true;

        while(index < 10){
            mul=n*k;
            while(mul > 0){
                mod=mul%10;
                for(int j=0; j < 10; j++){
                    if(array[j] == mod){
                        check = false;
                        break;
                    }
                }
                if(check == true) {
                    array[index] = mod;
                    index++;
                }
                mul=mul/10;
                check=true;
            }
            k++;
        }
        return k-1;
    }

    public static void main(String[] args) {
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }
}
