import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        answer += br.readLine().length();
        answer += br.readLine().length();
        answer += br.readLine().length();
        System.out.println(answer);
    }
}