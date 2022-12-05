public class SumSafe {
   static int isSumSafe(int[ ]a){
       int temp=0;
       if(a.length <= 1) return 0;
       for(int i: a) temp+=i;
       for(int i: a) if(temp == i) return 0;
       return 1;
   }


   public static void main(String[] args){
       System.out.println(isSumSafe(new int [] {5, -5, 0}));
       System.out.println(isSumSafe(new int [] {5, -2, 1}));
       System.out.println(isSumSafe(new int [] {}));
    }
}
