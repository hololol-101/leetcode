import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        fun(arr, 7);
        fun(arr, 5);
        fun(arr, 2);
        fun(arr, 1);
        System.out.println(arr[n]);
    }

    static void fun(int[] arr, int n){
        
        for(int i=n; i<arr.length; i++){
            if(arr[i]!=0 && i+n < arr.length &&arr[i+n]==0){
                arr[i+n] = arr[i]+1;
            }else if(arr[i]!=0 && i+n < arr.length && arr[i+n]!=0){
                arr[i+n] = Math.min(arr[i+n], arr[i]+1);
            }
        }
        if(n!=1){
            for(int i=n; i<arr.length; i*=n){
                if(arr[i]==0){
                    arr[i] = i/n;
                }else{
                    arr[i] = Math.min(arr[i], i/n);
                }
            }
        }

    }
}