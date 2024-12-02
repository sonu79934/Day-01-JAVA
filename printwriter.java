import java.io.PrintWriter;
public class  printwriter{
    public static void main(String args[]){
        PrintWriter PW=new PrintWriter(System.out);
        PW.println("Hello,World!");
        PW.print("This is a");
        PW.print("print statement.");
        PW.close();
    }
}