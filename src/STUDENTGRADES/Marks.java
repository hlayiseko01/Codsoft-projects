package STUDENTGRADES;

import java.util.Scanner;
public class Marks {
Scanner input =new Scanner(System.in);
    int total=0;

    //method for entering marks for each subject in the array
    public void inputmarks(int[] scores ){
        for (int i = 0; i < scores.length; i++) {
            System.out.println("please enter marks for subject "+(i+1));
            scores[i]=input.nextInt();
            total=total+scores[i];
        }
    }


    //determining grade
    public String calculateGrade(double average) {
        String result = null;
        if (average > 0 && average < 50) {
            result = "FAILED";
        } else if (average >= 50 && average < 75) {
            result = "PASS";
        } else if (average >= 75 && average < 100) {
            result = "PASS WITH DISTINCTION";
        }
        return result;
    }


}
