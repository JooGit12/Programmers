import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
                     
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                String[] strNums = inputLine.split(" ");
                int sum = Integer.parseInt(strNums[0]) + Integer.parseInt(strNums[1]);
                bw.write(String.valueOf(sum));
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
