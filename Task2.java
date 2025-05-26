import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        System.out.println("Enter no of subjects: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int totalMarks=0;

        int[] marks=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Subject"+(i+1));
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];
        }
        int average=totalMarks/n;
        String grade;
        if(average>90)
        {
            grade="Outstanding";
        }
        else if(average>80 && average<90){
            grade="A+";
        }
        else if(average>70 && average<80){
            grade="A";
        }
        else if(average>60 && average<70){
            grade="B";
        }
        else if(average>50 && average<60){
            grade="C";
        }
        else if(average>35 && average<50){
            grade="Pass";
        }
        else{
            grade="FAIL";
        }
        System.out.println("Total Marks: "+totalMarks+"\nAverage Percentage: "+average+"%\n"+"Grade: "+grade);
    sc.close();
    }
    
}
