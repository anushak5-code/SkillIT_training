package Daywise_classnotes;

public class array3 {
    static void main(String[] args) {
        int[][] stu_marks = {
                {10, 20, 30, 40},
                {23, 45, 56, 45}, {23, 45, 67, 89}, {57, 23, 12, 31}
        };
        //   b1 b2 b3 b4
        //a1 10 20 30 40
        //a2 23,45,56,45
        //a3 23,45,67,89
        //a4 57,23,12,31

        System.out.println(stu_marks[1][3]);
        System.out.println(stu_marks[3][3]);

        for (int i = 0; i < stu_marks.length; i++) {
            //System.out.println(stu_marks[i]);
            for (int j=0; j<stu_marks.length;j++){
                System.out.print(stu_marks[i] [j] + " ");
            }
            System.out.println( );
        }

    }
}
