import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        System.out.print(s +" = ");
        switch(str[1]){
            case "*":
                System.out.println(a*b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "+":
                System.out.println(a+b);
                break;
            case "/":
                System.out.println(a/b);
                break;        
                
            }
    
        
    }
    
}