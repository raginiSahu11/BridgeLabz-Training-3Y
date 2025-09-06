import java.util.Scanner;
public class CalendarGenerator {
    public static boolean isLeap(int y){ return (y%4==0 && y%100!=0) || (y%400==0); }
    public static String monthName(int m){ String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"}; return months[m-1];}
    public static int daysInMonth(int m,int y){ int[] d={31,28,31,30,31,30,31,31,30,31,30,31}; if(m==2 && isLeap(y)) return 29; return d[m-1];}
    public static int firstDay(int d,int m,int y){
        int y0 = y - (14 - m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14-m)/12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }
    public static void printCalendar(int month,int year){
        System.out.println("     "+monthName(month)+" "+year);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        int first=firstDay(1,month,year);
        int days=daysInMonth(month,year);
        for(int i=0;i<first;i++) System.out.print("   ");
        for(int day=1;day<=days;day++){
            System.out.printf("%3d", day);
            if((day+first)%7==0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("month(1-12): "); int m=sc.nextInt();
        System.out.print("year: "); int y=sc.nextInt();
        printCalendar(m,y);
    }
}
