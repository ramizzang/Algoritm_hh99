import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // 공백 구분 위해서 토큰선언

        int t = Integer.parseInt(br.readLine()); // 총 개수 입력받기

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i + 1) + ": ");
            bw.write(String.valueOf(a)+" + "+String.valueOf(b)+" = "+String.valueOf(a+b));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
