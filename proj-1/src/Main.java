import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String x="Hi There";
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        try{
            int T= Integer.parseInt(inp.readLine());
        }
        catch(IOException e)
        {
            System.out.println("Exception caught "+" "+e);
        }
        for(int i=0;i< x.length();i++)
        {

            System.out.print(x.charAt(i));
        }
    }
}
