package algorithm;
import java.util.Scanner;

public class kNotation {
	static int knotation(int n, int k, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 37�������� ǥ�� ����
		
		do {
			d[digits++] = dchar.charAt(n % k); // n�� k�� ���� �������� k������ �� �ڸ����̹Ƿ� �迭�� ����
			n /= k;
		} while (n != 0);
		for (int i = 0; i < digits / 2; i++) { // �迭�� ����(�ùٸ� ����)���� �ٽ� ����
			char temp = d[i];
			d[i] = d[digits - 1 - i];
			d[digits - 1 - i] = temp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] num = new char[100];
		
		System.out.print("insert n : ");
		int n = sc.nextInt();
		System.out.print("insert k : ");
		int k = sc.nextInt();
		sc.close();
		knotation(n, k, num);
		System.out.printf("%d to %d notation : ", n, k);
		for (int i = 0; num[i] != '\0'; i++) {
			System.out.print(num[i]);
		}
	}
}
