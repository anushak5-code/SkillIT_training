package Daywise_classnotes;

public class Operators2 {

     static void main(String[] args) {
        int a = 67;
        int  b = 56;
      System.out.println(a < b);
      System.out.println(a > b );
      System.out.println(a<=b);
      System.out.println(a>=b);
      System.out.println(a==b);
      System.out.println(a != b);

      int z = 78; // z = 78
      System.out.println(z);
      z +=2; // z=z+2 = 80
      System.out.println(z);
      z -=10; //z=80-10=70
      System.out.println(z);
      z *=2; //z=70*2=140
        System.out.println(z);
        z /=3; //z=140/3=46
        System.out.println(z);
        z %=2; //z=46%2=0
        System.out.println(z);

       int num =15;
        System.out.println(num%3==0 && num%4==0);

        num = 9;
        System.out.println(num%3==0 || num%9==0);




    }
}
