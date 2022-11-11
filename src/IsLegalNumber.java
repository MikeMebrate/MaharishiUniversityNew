public class IsLegalNumber {
    static int isLegalNumber(int[ ] a, int base){
        for(int i=0; i< a.length; i++){
            if(a[i] > base) return 0;
        }
        return 1;
    }

   static int convertToBase10(int[ ] a, int base){
       int temp=0, base1=1;
        if(isLegalNumber(a,base) != 1) return -1;
        else{
            int k=2;
            for(int i=a.length-1; i>=0; i--){
                for(int j=2;j < k;j++){
                    if(k==a.length-1) break;
                    else base1*=base;
                }
                if(i==a.length-2) temp+=(a[i]*base);
                else temp+=(a[i]*base1);
                base1=1;
                k++;
            }
      }
        return temp;
   }

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[ ] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[ ] {1,1,2}, 3) );
        System.out.println(convertToBase10(new int[ ]  {3, 2, 5}, 8));
    }
}
