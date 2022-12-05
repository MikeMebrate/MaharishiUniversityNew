public class stacked_number {
    static int isStacked(int n){
        int temp=0;
        for(int i=1; i <= n; i++) {
            temp += i;
            if (temp == n) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(16));
        System.out.println(isStacked(46));




    }
}
