public class PrimeNumbers {
    public int[] primes(int A) {
    List<Integer> res = new ArrayList<>();
    
    if(A < 2)
        return res.stream().mapToInt(i -> i).toArray();
        
    List<Integer> primes = new ArrayList<>();
    primes.add(2);
    res.add(2);
    
    for(int i = 3; i <= A; i++) {
        if(isPrime(i, primes)){
          if(i <= Math.sqrt(A)) {
            primes.add(i);
          }
          res.add(i);
        }
    }
    return res.stream().mapToInt(i -> i).toArray();
    }
 
  public boolean isPrime(int p, List<Integer> primes) {
    for(Integer i : primes) {
      if(p % i == 0)
        return false;
    }
    return true;
  }
}
