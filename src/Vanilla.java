public class Vanilla {
   static int isVanilla(int[] a){
       if(a.length == 0) return 1;
       else{
           int check = a[0]%10;
           int temp;
           for (int i=0; i < a.length; i++){
              if(a[i] < 0)  temp = -1*a[i];
              else  temp = a[i];
               while (temp>0){
                   int modules = temp%10;
                   temp/=10;
                   if(modules!=check) return 0;
                   else continue;
               }
           }
       }
       return 1;
   }

    public static void main(String[] args) {
    System.out.println(isVanilla(new int[]  {11, 101, 1111, 11111} ));
        System.out.println(isVanilla(new int[]  {1} ));
        System.out.println(isVanilla(new int[]  {11, 22, 13, 34, 125}  ));
        System.out.println(isVanilla(new int[] {9, 999, 99999, -9999} ));
        System.out.println(isVanilla(new int[]  {} ));
    }
}
