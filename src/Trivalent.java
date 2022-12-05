public class Trivalent {
    static  int isTrivalent (int[] a){
        int count=0;
        boolean check = true;
        for(int i=0; i < a.length; i++){
            for(int j=i+1; j < a.length; j++){
                if(a[i] == a[j]){
                       for(int k=i-1; k>=0; k--){
                           if(a[k] == a[i]){
                               check=false;
                               break;
                           }
                       }
                       if(check == true) count++;
                       else check = true;
                }
            }
        }
        if(a.length-count == 3) return 1;
        else return 0;
    }

    static public void main(String[] args){
       System.out.println(isTrivalent(new int[]  {22, 19, 10, 10, 19, 22, 22, 10}));
       System.out.println(isTrivalent(new int[]  {1, 2, 2, 2, 2, 2, 2}));
       System.out.println(isTrivalent(new int[]  {-1, 0, 1, 0, 0, 0} ));
       System.out.println(isTrivalent(new int[]  {} ));
       System.out.println(isTrivalent(new int[]  { 2147483647, -1, -1,-2147483648}));
    }
}
