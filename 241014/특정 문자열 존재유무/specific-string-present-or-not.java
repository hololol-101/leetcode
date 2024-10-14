import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        for(int i=0; i<n; i++){
            String s = br.readLine();
            if(s.contains(strs[1])){
                System.out.println(s);
            }
        }
    }
}