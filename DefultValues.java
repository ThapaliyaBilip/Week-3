
public class DefultValues
{
     byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
     public static void main(String[] argus)
    {
    DefultValues d1= new DefultValues();
    
      System.out.println("byte: " + d1.b);
        System.out.println("short: " + d1.s);
        System.out.println("int: " + d1.i);
        System.out.println("long: " + d1.l);
        System.out.println("float: " + d1.f);
        System.out.println("double: " + d1.d);
        System.out.println("char (as int): " + (int) d1.c); //will be 0
        System.out.println("boolean: " + d1.bool);
    
    
    }
}