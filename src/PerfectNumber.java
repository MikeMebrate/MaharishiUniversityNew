public class PerfectNumber {
    static int henry (int i, int j){
        int count=0; //Count how many times should be iterated
        int k=1;
        int p = 1;
        int temp=0,temp2=0,temp3 = 0;  // Store temporary numbers
       while(count < i){  //For the i-th  Perfect number
           while(p < k){
               if(k%p == 0) temp+=p;
               p++;
           }
           if(temp == k) {
               count++; k++;
               temp2=temp;
               temp=0; p=1;
           } else{
               temp = 0;
               k++; p=1;
           }
      }
        while(count < j){  //For the j-th number
            while(p< k){
                if(k%p == 0) temp+=p;
                p++;
            }
            if(temp == k) {
                count++; k++;
                temp3=temp;
                temp=0; p=1;
            } else{
                temp = 0;
                k++; p=1;
            }
        }
    return temp2+temp3; //Return of i-th and j-th Perfect Number
    }

    public static void main(String args[]){
        System.out.println(henry(1,5));
    }
}
