package Daywise_classnotes;

public class array7 {
    public static void main(String[] args){
        int [] a = {12,34,23,56,45,78,90};
        int even_no = 0;
        int odd_no = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]%2==0){
                even_no++;
            }else{
                odd_no++;
            }}
            System.out.println("even no = " + even_no);
            System.out.println("odd no = " + odd_no);

    }
}
