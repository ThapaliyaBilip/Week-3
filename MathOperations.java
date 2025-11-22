public class MathOperations
{
    public static void main(String[] argus)
    {
        int a=20;
        int b=10;
        
        //Arithmetic
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("a*b="+(a*b));
        //Unary
        System.out.println();
        System.out.println("pre increment:"+(++a));
        System.out.println("post increment"+(a++));
        
        //Assignment
        
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        //Relational operators
        int p=15;
        int q=18;
        System.out.println("p==q" +(p==q));
        System.out.println("p!=q" +(p!=q));
        System.out.println("p>q" +(p>q));
        System.out.println("p<q" +(p<q));
        System.out.println("p>=q" +(p>=q));
        System.out.println("p<=q" +(p<=q));
        boolean condition1 = true;
        boolean condition2 = false;
        
        //logical operators
        System.out.println("Conditional1 && Conditional2" +(condition1 && condition2));
        System.out.println("Conditional1 && Conditional2" +(condition1 || condition2));
        
        
        //ternary
        int age=18;
        String status=(age>=18)? "major":"minor";
        System.out.println("Status based on age"+age+ ":"+status);
        
    }
}