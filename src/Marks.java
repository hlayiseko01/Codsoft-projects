import java.util.Scanner;
public class Marks {
Scanner input =new Scanner(System.in);
    int total=0;

    public void inputmarks(int[] scores ){
        for (int i = 0; i < scores.length; i++) {
            System.out.println("please enter marks for subject "+(i+1));
            scores[i]=input.nextInt();
            total=total+scores[i];
        }
    }
    public String calculateGrade(double avarage){

        if(avarage>0&&avarage<50){
            return "FAILED";
        } else if (avarage>=50&&avarage<75) {
            return "PASS";

        } else if (avarage>=75&&avarage>=100) {
            return "PASS WITH DISTINCTION";

        }
return "";
    }

}
