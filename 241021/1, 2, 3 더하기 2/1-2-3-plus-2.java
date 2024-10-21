import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mod = 1000000007;
        int[][]arr = new int[n+1][4];
        arr[1][1] = 1;
        arr[2][2] = 1;
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[3][3] = 1;
        for(int i=4; i<=n; i++){
            arr[i][1] = (arr[i-1][2] +arr[i-1][3])%mod;
            arr[i][2] = (arr[i-2][1] +arr[i-2][3])%mod;
            arr[i][3] = (arr[i-3][1] +arr[i-3][2])%mod;
        }
        int answer = (arr[n][1]+arr[n][2]+arr[n][3])%mod;
        System.out.println(answer);
    }

}
//1 = 1 = 1 + 0 + 0
//2 = 1 = 0 + 1 + 0
//3 = 0 = 1 + 1 + 1
//4 = 3 = 2 + 0 + 1
//5 = 4 = 1 + 2 + 1
//6 = 8 = 3 + 3 + 2 
//7 = 9
//8 = 12
//9 = 21
//10 = 27
//11 = 37
//12 = 58