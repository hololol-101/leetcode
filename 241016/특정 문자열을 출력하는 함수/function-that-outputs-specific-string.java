import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append("\n");
        sb.append("#@#@#@#@#@").append("\n");
        sb.append("CodeTree").append("\n");
        sb.append("@#@#@#@#@#").append("\n");
        sb.append("Students!").append("\n");
        
        for(int i=0; i<n; i++){
            System.out.println(sb.toString());
        }

    }
}