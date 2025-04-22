package CRT;
import java.util.*;
public class Demo {

        int a=1;
        String name="Dhruv1";
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Demo a=new Demo();
        System.out.println("Enter naam or number");
        a.a =s.nextInt();
        a.name =s.next();
        System.out.println(a.a);
        System.out.println(a.name);

    }
}
