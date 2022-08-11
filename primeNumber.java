package algorithm;
import java.io.*;

class primeNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int ptr = 0;
		int[] prime = new int[n];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for (int i = 5; i <= n; i += 2) {
			boolean isNotPrime = false;
			
			for (int j = 1; prime[j] * prime[j] <= i; j++) {
				if (i % prime[j] == 0) {
					isNotPrime = true;
					break;
				}
			}
			
			if (!isNotPrime) {
				prime[ptr++] = i;
			}
		}
		
		for (int i = 0; prime[i] != 0; i++) {
			System.out.println(prime[i]);
		}
		
		br.close();
	}
}