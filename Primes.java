public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[n+1];
        int p = 2;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i<=n; i++){
            primes[i] = false;
        }
        for (int i = 2; i<=n; i++){
            primes[i] = true;
        }
        for (int i = 3; i<=n; i++){
           if (i%p==0){
            primes[i] = false;
           }
           if (i == n){
            p++;
            i = p;
           }
        }
        int count = 0;
       for( int i=2; i <=n; i++ ){
        if (primes[i]){
            System.out.println(i);
            count++;
        }
            
       } 
       double precent = ((double)count / n) * 100;
        System.out.println("There are " + count + " primes between 2 and " + n +" (" + (int)precent + "% are primes)");
    }
}