public class RepsEqual {
    static int repsEqual(int[ ] a, int n){
        int org = n;
        int count = 0;
        int  i=a.length-1, temp=0;
        while(count < a.length ){
            temp = n%10;
            n = n/10;
            if(a[i] != temp) return 0;
            i--;
            count++;
            if(i < 0) break;
        }
        return 1;
    }

    public static void main (String args[]){
        System.out.println(repsEqual(new int[] {3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[] {3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[] {3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[] {2, 3, 0, 5, 3} , 32053));
        System.out.println(repsEqual(new int[] {9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[] {0, 3, 2, 0, 5, 3}, 32053));
    }

}
