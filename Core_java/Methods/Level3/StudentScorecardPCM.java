import java.util.*;
public class StudentScorecardPCM {
    public static int[][] generateScores(int students){
        Random r=new Random();
        int[][] s=new int[students][3];
        for(int i=0;i<students;i++){
            s[i][0]=10 + r.nextInt(90); // 2-digit (10..99)
            s[i][1]=10 + r.nextInt(90);
            s[i][2]=10 + r.nextInt(90);
        }
        return s;
    }
    public static double[][] computeStats(int[][] s){
        int n=s.length;
        double[][] stats=new double[n][3]; // total, avg, percent
        for(int i=0;i<n;i++){
            int total = s[i][0]+s[i][1]+s[i][2];
            double avg = Math.round((total/3.0)*100.0)/100.0;
            double percent = Math.round((total/300.0*100.0)*100.0)/100.0;
            stats[i][0]=total; stats[i][1]=avg; stats[i][2]=percent;
        }
        return stats;
    }
    public static void display(int[][] s,double[][] stats){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t% ");
        for(int i=0;i<s.length;i++){
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\n", s[i][0],s[i][1],s[i][2],(int)stats[i][0],stats[i][1],stats[i][2]);
        }
    }
    public static void main(String[] args){
        int students=5;
        int[][] marks = generateScores(students);
        double[][] stats = computeStats(marks);
        display(marks, stats);
    }
}
