import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int [n];
        arr[0] = 1;
        arr[1] = 3;
        for(int i=2; i<n; i++){
            arr[i] = arr[i-1]+arr[i-2]+1;
        }
        System.out.println(arr[n-1]);
    }
}