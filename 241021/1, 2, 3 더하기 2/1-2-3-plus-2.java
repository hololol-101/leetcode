import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mod = 1000000007;
        int[][]arr = new int[n+1][3];
        arr[1][0] = 1;
        arr[2][1] = 1;
        arr[3][0] = 1;
        arr[3][1] = 1;
        arr[3][2] = 1;
        for(int i=4; i<=n; i++){
            arr[i][0] = (arr[i-1][1] +arr[i-1][2])%mod;
            arr[i][1] = (arr[i-2][0] +arr[i-2][2])%mod;
            arr[i][2] = (arr[i-3][0] +arr[i-3][1])%mod;
        }
        int answer = (arr[n][0]+arr[n][1])%mod ;
        answer = (answer +arr[n][2])%mod;
        System.out.println(answer);
    }

}