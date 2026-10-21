package Daywise_classnotes;

public class array6 {
    static void main (String[] arg){
        int [] a = {-23,-45,-1000,-22333,-34,-2,-12333444,-233,-34};
        int max = a[0];
        for (int i :a){
            if (max<i){
                max =i;
            }
        }System.out.println(max);
    }
}
