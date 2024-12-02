import java.util.*;
public class stringformat{
    public static void main(String[] args) {
        //Accepting a string
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = String.format("congratulations %s you won 5 lackhs",a);
        System.out.println(b);
    }
}