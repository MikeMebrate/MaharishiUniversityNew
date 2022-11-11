public class Matches {


    static int matches(int[] a, int[] p){
        int sizeOfP=0;
        for(int i=0; i < p.length; i++){
            if(p[i] < 0) sizeOfP +=(p[i] * -1);
            else sizeOfP+=p[i];
        }

        if(sizeOfP != a.length) return 0;
        else{
            int j=0, k=0,sign;
            for(int i=0; i<p.length; i++){

                if(p[i] < 0) sign=-1*p[i];
                else sign = p[i];

                while(j < a.length && k < sign ) {
                    if(p[i] > 0 && a[j] > 0) j++;
                    else if(p[i] < 0 && a[j] < 0) j++;
                    else return 0;
                    k++;
                }
                k=0;

            }
        }

        return 1;
    }


    static public void main(String args[]){
        System.out.println(matches(new int[]  {1, 2, 3, -5, -5, 2, 3, 18}, new int []{3, -2, 3}));
        System.out.println(matches(new int[]  {1, 2, 3, -5, -5, 2, 3, 18}, new int []{2, 1, -1, -1, 2, 1}));
        System.out.println(matches(new int[]  {1, 2, 3, -5, -5, 2, 3, 18}, new int []{1, 2, -1, -1, 1, 2}));
        System.out.println(matches(new int[]  {1, 2, 3, -5, -5, 2, 3, 18}, new int []{2, 1, -2, 3}));
        System.out.println(matches(new int[]  {1, 2, 3, -5, -5, 2, 3, 18}, new int []{4, -1, 3}));
    }

}
