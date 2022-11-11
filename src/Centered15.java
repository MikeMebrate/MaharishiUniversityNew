public class Centered15 {
    static int isCentered15(int[ ] a){
        int countL = 1, countR=a.length;
       int left = (a.length/2)-1, right=(a.length/2)+1, center = a.length/2;
       if(a[center] == 15) return 1;
       int sum=0, i=0;
        if(sum == 15) return 1;
        else{
            sum=0;
            while(i<a.length && left > 0 && right < a.length){
                sum+=a[center]+a[left]+a[right];
                countR--;
                countL++;
                if(sum == 15 && (countR-countL)/2 == countL) return 1;
                left--; right++;
                i++;
            }
        }
        return 0;
    }

    public static void main(String args[]){
          System.out.println(isCentered15(new int[] {3, 2, 10, 4, 1, 6, 9}));
          System.out.println(isCentered15(new int[] {2, 10, 4, 1, 6, 9}));
          System.out.println(isCentered15(new int[] {3, 2, 10, 4, 1, 6}));
          System.out.println(isCentered15(new int[] {1,1,8, 3, 1, 1}));
          System.out.println(isCentered15(new int[] {9, 15, 6} ));
          System.out.println(isCentered15(new int[] {1, 1, 2, 2, 1, 1} ));
          System.out.println(isCentered15(new int[] {1, 1, 15, -1,-1} ));
    }
}
