import java.util.Scanner;
public class A {
    String n;
    String sn;
    int a;
    public A(String n,String sn,int a){
        this.n = n;
        this.sn = sn;
        this.a = a;
    }

    public static void p(String t){
        System.out.print(t);
    }

    public static void main(String[] args){
        p("What's your first name? : ");
        Scanner fn = new Scanner(System.in);
        String nn = fn.next();
        p("What's your last name? : ");
        Scanner ln = new Scanner(System.in);
        String lnn = ln.next();
        p("How old are you? : ");
        Scanner age = new Scanner(System.in);
        int aa = age.nextInt();
        A myObj = new A(nn,lnn,aa);
        System.out.println(myObj.n);
        System.out.println(myObj.sn);
        System.out.println(myObj.a);


    }
}