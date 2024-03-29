import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int len =Integer.parseInt(br.readLine());
			
			for (int i = 0; i < len; i++) {
                String[] strArr = br.readLine().split(" ");
                int sum = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
                
                bw.write(String.valueOf(sum));
                bw.newLine();
			}
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
