package algorithm;
import java.io.*;

class reverse {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        br.close();
        for (int i = 0; i < str.length / 2; i++) {
        	String temp = str[i];
        	str[i] = str[str.length - 1 - i];
        	str[str.length - i - 1] = temp;
        }
        for (int i = 0; i < str.length; i++) {
        	System.out.print(str[i] + " ");
        }
    }
}