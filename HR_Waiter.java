import java.util.ArrayList;
import java.util.List;
/**
 * HR_Waiter
 */
public class HR_Waiter {

    static boolean isPrime(int n){
        //since 0 and 1 is not prime return false.
        if(n==1||n==0)return false;
 
        //Run a loop from 2 to n-1
        for(int i=2; i<n; i++){
          // if the number is divisible by i, then n is not a prime number.
              if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
    }

    public static List<Integer> waiter(List<Integer> number, int q) {
        // Write your code here
        List<Integer> primes = new ArrayList<>();
        int k = 2;
        while(primes.size()<q){
            if (isPrime(k)) {
                primes.add(k);
            }
            k++;
        }
        List<Integer> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        while(primes.size()>0){
            for (int i = number.size()-1; i >=0; i--) {
                if(number.get(i) != null){
                    if(number.get(i) % primes.get(0) > 0){
                        a.add(number.get(i));
                    }else{
                        b.add(number.get(i));
                        if(a.contains(number.get(i))){
                            a.remove(a.indexOf(number.get(i)));
                        }
                        number.set(i, null);
                        
                    }
                }
            }
            while(!b.isEmpty()){
                ans.add(b.remove(b.size()-1));
            }
            primes.remove(0);
        }
        while(!a.isEmpty()){
            ans.add(a.remove(a.size()-1));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(waiter(new ArrayList<>(List.of(3,4,7,6,5)), 1));
    }
}