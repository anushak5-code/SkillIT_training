package Daywise_classnotes;

public class array1 {
    static void main(String[] args) {
        String[] names = {"abcd", "dgffh", "yruru", "dhdhd", "hjjd", ""};
        System.out.println(names);


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);
       // System.out.println(names[6]);
       System.out.println(names.length);
       //for (int i=0;i<names.length;i++)
          // System.out.println(names[i]);
       for(String i:names){
           System.out.println(i);
       }
    }
}