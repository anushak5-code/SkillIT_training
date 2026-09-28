package Daywise_classnotes;


 class Operators {
     public static void main(String[] args) {

        int a = 35, b = 3;
        System.out.println(a + b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(35.0/2);
       int z;
       System.out.println(z=12-56/25%5*2+5);

        a = 15;
        b = 45;
        ++a; //16
        b++; //46
       System.out.println(a);
       System.out.println(b);

       System.out.println(a++);//16
       System.out.println(++b);//47

        int y = a++ + ++b;
        System.out.println(y);

        y = ++a + ++b;
        System.out.println(y);

        y = a + ++b;
        System.out.println(y);

        y= a++ + b;
        System.out.println(y);

        int g = 13;
        System.out.println(g++ + ++g);
    }
}