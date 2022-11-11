public class PorcupineNumber {
    static int isPrime(int p){
        if(p%2 == 0) return 0;
        else {
            for (int i = 3; i <= p / 2; i += 2) {
                if (p % i == 0) return 0;
            }
        }return 1;
    }
    static int findPorcupineNumber(int n) {
        int nextPrime = n;
        while (nextPrime % 10 != 9) nextPrime++;
        while (isPrime(nextPrime) == 0) nextPrime += 10;

        boolean trueNinebool = true;
        while (trueNinebool == true) {
            for (int i = 1; i < 10; i++) {
                if (isPrime(nextPrime + i) == 1) {
                    trueNinebool = false; break;
                }
            }

            if (isPrime(nextPrime+10) == 1 && trueNinebool == true){
                for (int i = 1; i < 10; i++) {
                    if (isPrime(nextPrime + i) == 1) {
                        trueNinebool = false; break;
                    }
                }
                if (isPrime(nextPrime) == 1 && trueNinebool == true) return nextPrime;
            }
                trueNinebool = true; nextPrime+=10;
        }
        return nextPrime;
    }
    public static void main (String args[]){
        System.out.println(findPorcupineNumber(1));
        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(409));
        System.out.println(findPorcupineNumber(709));
    }
}
