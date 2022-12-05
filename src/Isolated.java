public class Isolated {
    static int isIsolated(long n){
        long square = n*n;
        long cube = square*n;
        int count=0;

        if(cube > Long.MAX_VALUE ) return -1;
        else {
            while(square > 0){
                int modules = (int)square%10;
                square/=10;
                count++;
            }
            square=n*n;
            int[] squareArray = new int[count];
            count=0;
            while(square > 0){
                int modules = (int)square%10;
                square/=10;
                squareArray[count] = modules;
                count++;
            }
            int squareSize = squareArray.length;
            while(cube>0){
              int modules = (int)cube%10;
              cube/=10;
              for (int i:squareArray) if(i==modules) return 0;
          }

        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isIsolated(69));
        System.out.println(isIsolated(163));
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
        System.out.println(isIsolated(14));
        System.out.println(isIsolated(24));
        System.out.println(isIsolated(28));
        System.out.println(isIsolated(34));
        System.out.println(isIsolated(58));
        System.out.println(isIsolated(63));

    }
}
