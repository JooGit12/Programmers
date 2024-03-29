import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			long factorial = 1;

			for (int i = 2; i <= n; i++) {
				factorial *= i;
			}

			bw.write(String.valueOf(factorial));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
