/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamikfibonacci;

/**
 *
 * @author mustafa
 */
public class DinamikFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final long startTime = System.currentTimeMillis();
        System.out.println(fibDP(100000));
         final long endTime = System.currentTimeMillis();
         System.out.println("\n  execution time: " + (endTime - startTime) );
    }
    public static long fibDP(int x) { //O(n)
		long fib[] = new long[x + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < x + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[x];
	}
}
