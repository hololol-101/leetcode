import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++){
            for(int j=0; j<n; j++){
                sb.append(i*(int)Math.pow(2, j)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}