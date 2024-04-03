package STUDENTGRADES;

import java.util.Scanner;
public class studentIntface {
    public static void main(String[]arg) {
        Scanner input =new Scanner(System.in);
        Marks marks= new Marks();
        int subjects;
        double averagePercent;


        System.out.println("please enter the number of subjects you are studying");
        subjects= input.nextInt();

        int[] scores = new int[subjects];
        marks.inputmarks(scores);//calling method to enter all the scores
        averagePercent= (double) marks.total /subjects;

        System.out.println("TOTAL GRADES :"+marks.total );
        System.out.println("GRADE AVERAGE :"+ averagePercent);

        System.out.println("RESULTS:\t" + marks.calculateGrade(averagePercent));

    }
}
