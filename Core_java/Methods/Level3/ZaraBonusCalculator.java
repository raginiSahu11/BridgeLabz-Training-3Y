import java.util.*;
public class ZaraBonusCalculator {
    public static double[][] generateEmployees(int n){
        Random r=new Random();
        double[][] arr=new double[n][2]; // salary, years
        for(int i=0;i<n;i++){
            arr[i][0] = 10000 + r.nextInt(90000); // 5-digit approx (10000..99999)
            arr[i][1] = r.nextInt(11); // 0..10 years
        }
        return arr;
    }
    public static double[][] computeNewSalaryAndBonus(double[][] data){
        int n=data.length;
        double[][] out=new double[n][3]; // old, new, bonus
        for(int i=0;i<n;i++){
            double oldS = data[i][0];
            double yrs = data[i][1];
            double bonusPerc = yrs>5 ? 0.05 : 0.02;
            double bonus = oldS * bonusPerc;
            double newS = oldS + bonus;
            out[i][0]=oldS; out[i][1]=newS; out[i][2]=bonus;
        }
        return out;
    }
    public static void displaySummary(double[][] arr){
        double sumOld=0,sumNew=0,sumBonus=0;
        System.out.println("Old\tNew\tBonus");
        for(double[] r:arr){
            System.out.printf("%.2f\t%.2f\t%.2f\n", r[0], r[1], r[2]);
            sumOld+=r[0]; sumNew+=r[1]; sumBonus+=r[2];
        }
        System.out.println("Totals:");
        System.out.printf("SumOld=%.2f SumNew=%.2f TotalBonus=%.2f\n", sumOld,sumNew,sumBonus);
    }
    public static void main(String[] args){
        double[][] emp = generateEmployees(10);
        double[][] res = computeNewSalaryAndBonus(emp);
        displaySummary(res);
    }
}
