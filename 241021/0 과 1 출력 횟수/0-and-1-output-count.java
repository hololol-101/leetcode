import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] zero = new int[n+2];
        int[] one = new int[n+2];
        zero[0] = 1;
        one[1] = 1;
        for(int i=2; i<=n; i++){
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }
        System.out.println(zero[n]+ " "+one[n]);
    }
}